#!/bin/bash

NAME="hello_app"
DJANGODIR=./django_rest_api/
SOCKFILE=./gunicorn.sock
USER=ubuntu
GROUP=webapps
NUM_WORKERS=3
DJANGO_SETTINGS_MODULE=hello.settings
DJANGO_WSGI_MODULE=hello.wsgi
PYTHONPATH=~/.virtualenvs/AirPollutionMonitoring/

echo "Starting $NAME as `whoami`"

cd $DJANGODIR



source $PYTHONPATH/bin/activate
export DJANGO_SETTINGS_MODULE=$DJANGO_SETTINGS_MODULE
export PYTHONPATH=$PYTHONPATH

exec $PYTHONPATH/bin/gunicorn $DJANGO_WSGI_MODULE:application \
    --name $NAME \
    --workers $NUM_WORKERS \
    --user=$USER --group=$GROUP \
    --bind=unix:$SOCKFILE \
    --log-level=debug \
    --log-file=gunicorn_log