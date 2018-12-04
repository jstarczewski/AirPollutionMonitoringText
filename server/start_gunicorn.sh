#!/bin/bash

NAME="django_rest_api"
DJANGODIR=~/Apps/AirPollutionMonitoring/server/django_rest_api/
SOCKFILE=$DJANGODIR/../gunicorn.sock
USER=ubuntu
GROUP=webapps
NUM_WORKERS=3
DJANGO_SETTINGS_MODULE=django_rest_api.settings
DJANGO_WSGI_MODULE=django_rest_api.wsgi
PYTHON_PATH=~/.virtualenvs/AirPollutionMonitoring

echo "Starting $NAME as `whoami`."

cd $DJANGODIR


source $PYTHON_PATH/bin/activate
export PYTHONPATH=$PYTHON_PATH/bin/python3
echo "$PYTHON_PATH/bin/gunicorn ${DJANGO_WSGI_MODULE}:application"
exec $PYTHON_PATH/bin/gunicorn $DJANGO_WSGI_MODULE \
    --name $NAME \
    --workers $NUM_WORKERS \
    --user=$USER --group=$GROUP \
    --bind=unix:$SOCKFILE \
    --log-level=debug \

echo "$NAME started succesfully."
