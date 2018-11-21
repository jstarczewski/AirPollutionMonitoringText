from django.db import models
from django.contrib.postgres.fields import JSONField


class Sensor(models.Model):
    name = models.CharField('Name', max_length=50)
    city = models.CharField('City', max_length=50)
    street = models.CharField('Street', max_length=50)


class Pollutant(models.Model):
    name = models.CharField('Name', max_length=50)
    short_name = models.CharField('Short Name', max_length=10, null=True)
    harmfulness_ranges = models.CharField('Harmfulness ranges', max_length=50)


class Measurement(models.Model):
    pollution_level = models.CharField('Air pollution level', max_length=10)
    timestamp = models.DateTimeField('Timestamp', auto_now=True)
    sensor = models.ForeignKey('Sensor', on_delete=models.CASCADE)
    pollutants_values = JSONField("Pollutants' Value")

