package com.study.help;

import java.util.List;

/**
 * @program: AndroidStudy
 * @description: json插件转换测试
 * @author: Adolf
 * @create: 2020-07-03 14:43
 **/
public class GsonFormate {

    /**
     * status : ok
     * api_version : v2.5
     * api_status : active
     * lang : zh_CN
     * unit : metric
     * tzshift : 28800
     * timezone : Asia/Taipei
     * server_time : 1593758578
     * location : [25.1552,121.6544]
     * result : {"realtime":{"status":"ok","temperature":32.16,"humidity":0.7,"cloudrate":0.9,"skycon":"CLOUDY","visibility":16,"dswrf":763.8,"wind":{"speed":30.96,"direction":220},"pressure":99214.96,"apparent_temperature":31.8,"precipitation":{"local":{"status":"ok","datasource":"radar","intensity":0},"nearest":{"status":"ok","distance":16,"intensity":2}},"air_quality":{"pm25":3,"pm10":0,"o3":0,"so2":0,"no2":0,"co":0,"aqi":{"chn":8,"usa":0},"description":{"usa":"","chn":"优"}},"life_index":{"ultraviolet":{"index":1,"desc":"很弱"},"comfort":{"index":0,"desc":"闷热"}}},"minutely":{"status":"ok","datasource":"radar","precipitation_2h":[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],"precipitation":[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],"probability":[0,0,0,0],"description":"您北边16公里正下着暴雨呢"},"hourly":{"status":"ok","description":"阴，明天中午13点钟后转多云，其后云渐少","precipitation":[{"datetime":"2020-07-03T14:00+08:00","value":0},{"datetime":"2020-07-03T15:00+08:00","value":0},{"datetime":"2020-07-03T16:00+08:00","value":0.057},{"datetime":"2020-07-03T17:00+08:00","value":0},{"datetime":"2020-07-03T18:00+08:00","value":0},{"datetime":"2020-07-03T19:00+08:00","value":0},{"datetime":"2020-07-03T20:00+08:00","value":0},{"datetime":"2020-07-03T21:00+08:00","value":0},{"datetime":"2020-07-03T22:00+08:00","value":0},{"datetime":"2020-07-03T23:00+08:00","value":0},{"datetime":"2020-07-04T00:00+08:00","value":0},{"datetime":"2020-07-04T01:00+08:00","value":0},{"datetime":"2020-07-04T02:00+08:00","value":0},{"datetime":"2020-07-04T03:00+08:00","value":0},{"datetime":"2020-07-04T04:00+08:00","value":0},{"datetime":"2020-07-04T05:00+08:00","value":0},{"datetime":"2020-07-04T06:00+08:00","value":0},{"datetime":"2020-07-04T07:00+08:00","value":0},{"datetime":"2020-07-04T08:00+08:00","value":0},{"datetime":"2020-07-04T09:00+08:00","value":0},{"datetime":"2020-07-04T10:00+08:00","value":0},{"datetime":"2020-07-04T11:00+08:00","value":0},{"datetime":"2020-07-04T12:00+08:00","value":0},{"datetime":"2020-07-04T13:00+08:00","value":0},{"datetime":"2020-07-04T14:00+08:00","value":0},{"datetime":"2020-07-04T15:00+08:00","value":0.5845},{"datetime":"2020-07-04T16:00+08:00","value":1.4291},{"datetime":"2020-07-04T17:00+08:00","value":0.3017},{"datetime":"2020-07-04T18:00+08:00","value":0},{"datetime":"2020-07-04T19:00+08:00","value":0},{"datetime":"2020-07-04T20:00+08:00","value":0},{"datetime":"2020-07-04T21:00+08:00","value":0},{"datetime":"2020-07-04T22:00+08:00","value":0},{"datetime":"2020-07-04T23:00+08:00","value":0},{"datetime":"2020-07-05T00:00+08:00","value":0},{"datetime":"2020-07-05T01:00+08:00","value":0},{"datetime":"2020-07-05T02:00+08:00","value":0},{"datetime":"2020-07-05T03:00+08:00","value":0},{"datetime":"2020-07-05T04:00+08:00","value":0},{"datetime":"2020-07-05T05:00+08:00","value":0},{"datetime":"2020-07-05T06:00+08:00","value":0},{"datetime":"2020-07-05T07:00+08:00","value":0},{"datetime":"2020-07-05T08:00+08:00","value":0},{"datetime":"2020-07-05T09:00+08:00","value":0},{"datetime":"2020-07-05T10:00+08:00","value":0},{"datetime":"2020-07-05T11:00+08:00","value":0},{"datetime":"2020-07-05T12:00+08:00","value":0.0653},{"datetime":"2020-07-05T13:00+08:00","value":0.8518}],"temperature":[{"datetime":"2020-07-03T14:00+08:00","value":32.16},{"datetime":"2020-07-03T15:00+08:00","value":30.8},{"datetime":"2020-07-03T16:00+08:00","value":30.14},{"datetime":"2020-07-03T17:00+08:00","value":28.68},{"datetime":"2020-07-03T18:00+08:00","value":28.12},{"datetime":"2020-07-03T19:00+08:00","value":27.56},{"datetime":"2020-07-03T20:00+08:00","value":26.5},{"datetime":"2020-07-03T21:00+08:00","value":26.4},{"datetime":"2020-07-03T22:00+08:00","value":26.3},{"datetime":"2020-07-03T23:00+08:00","value":26.2},{"datetime":"2020-07-04T00:00+08:00","value":26.1},{"datetime":"2020-07-04T01:00+08:00","value":26},{"datetime":"2020-07-04T02:00+08:00","value":26.5},{"datetime":"2020-07-04T03:00+08:00","value":27},{"datetime":"2020-07-04T04:00+08:00","value":27.5},{"datetime":"2020-07-04T05:00+08:00","value":28},{"datetime":"2020-07-04T06:00+08:00","value":28.5},{"datetime":"2020-07-04T07:00+08:00","value":29},{"datetime":"2020-07-04T08:00+08:00","value":29.5},{"datetime":"2020-07-04T09:00+08:00","value":30},{"datetime":"2020-07-04T10:00+08:00","value":30.5},{"datetime":"2020-07-04T11:00+08:00","value":31},{"datetime":"2020-07-04T12:00+08:00","value":31},{"datetime":"2020-07-04T13:00+08:00","value":30.8},{"datetime":"2020-07-04T14:00+08:00","value":31},{"datetime":"2020-07-04T15:00+08:00","value":30.9},{"datetime":"2020-07-04T16:00+08:00","value":30.74},{"datetime":"2020-07-04T17:00+08:00","value":30.28},{"datetime":"2020-07-04T18:00+08:00","value":29.77},{"datetime":"2020-07-04T19:00+08:00","value":29.2},{"datetime":"2020-07-04T20:00+08:00","value":28.44},{"datetime":"2020-07-04T21:00+08:00","value":27.86},{"datetime":"2020-07-04T22:00+08:00","value":27.5},{"datetime":"2020-07-04T23:00+08:00","value":27.23},{"datetime":"2020-07-05T00:00+08:00","value":26.88},{"datetime":"2020-07-05T01:00+08:00","value":26.54},{"datetime":"2020-07-05T02:00+08:00","value":26.75},{"datetime":"2020-07-05T03:00+08:00","value":27},{"datetime":"2020-07-05T04:00+08:00","value":27.29},{"datetime":"2020-07-05T05:00+08:00","value":26},{"datetime":"2020-07-05T06:00+08:00","value":28.01},{"datetime":"2020-07-05T07:00+08:00","value":28.25},{"datetime":"2020-07-05T08:00+08:00","value":28.39},{"datetime":"2020-07-05T09:00+08:00","value":28.39},{"datetime":"2020-07-05T10:00+08:00","value":28.51},{"datetime":"2020-07-05T11:00+08:00","value":31},{"datetime":"2020-07-05T12:00+08:00","value":29.45},{"datetime":"2020-07-05T13:00+08:00","value":30}],"wind":[{"datetime":"2020-07-03T14:00+08:00","speed":30.96,"direction":220},{"datetime":"2020-07-03T15:00+08:00","speed":5.84,"direction":325.62},{"datetime":"2020-07-03T16:00+08:00","speed":2.73,"direction":344.64},{"datetime":"2020-07-03T17:00+08:00","speed":2.36,"direction":2.37},{"datetime":"2020-07-03T18:00+08:00","speed":1.34,"direction":19.52},{"datetime":"2020-07-03T19:00+08:00","speed":0.36,"direction":282.01},{"datetime":"2020-07-03T20:00+08:00","speed":2,"direction":301.51},{"datetime":"2020-07-03T21:00+08:00","speed":2.98,"direction":291.2},{"datetime":"2020-07-03T22:00+08:00","speed":2.87,"direction":244.97},{"datetime":"2020-07-03T23:00+08:00","speed":4.59,"direction":181.87},{"datetime":"2020-07-04T00:00+08:00","speed":4.69,"direction":179.06},{"datetime":"2020-07-04T01:00+08:00","speed":3.48,"direction":234.46},{"datetime":"2020-07-04T02:00+08:00","speed":5.33,"direction":276.95},{"datetime":"2020-07-04T03:00+08:00","speed":6.65,"direction":261.95},{"datetime":"2020-07-04T04:00+08:00","speed":8.67,"direction":230.12},{"datetime":"2020-07-04T05:00+08:00","speed":9.03,"direction":212.93},{"datetime":"2020-07-04T06:00+08:00","speed":7.9,"direction":200.79},{"datetime":"2020-07-04T07:00+08:00","speed":6.5,"direction":204.72},{"datetime":"2020-07-04T08:00+08:00","speed":4.54,"direction":222.73},{"datetime":"2020-07-04T09:00+08:00","speed":2.23,"direction":292.57},{"datetime":"2020-07-04T10:00+08:00","speed":2.37,"direction":325.36},{"datetime":"2020-07-04T11:00+08:00","speed":1.55,"direction":313.83},{"datetime":"2020-07-04T12:00+08:00","speed":0.96,"direction":6.95},{"datetime":"2020-07-04T13:00+08:00","speed":0.8,"direction":9.78},{"datetime":"2020-07-04T14:00+08:00","speed":1.71,"direction":76.65},{"datetime":"2020-07-04T15:00+08:00","speed":2.1,"direction":77.64},{"datetime":"2020-07-04T16:00+08:00","speed":1.65,"direction":69.79},{"datetime":"2020-07-04T17:00+08:00","speed":2.14,"direction":109.39},{"datetime":"2020-07-04T18:00+08:00","speed":1.44,"direction":120.32},{"datetime":"2020-07-04T19:00+08:00","speed":1.51,"direction":149.7},{"datetime":"2020-07-04T20:00+08:00","speed":1.87,"direction":170.36},{"datetime":"2020-07-04T21:00+08:00","speed":2.52,"direction":161.83},{"datetime":"2020-07-04T22:00+08:00","speed":1.48,"direction":233.32},{"datetime":"2020-07-04T23:00+08:00","speed":4.89,"direction":284.63},{"datetime":"2020-07-05T00:00+08:00","speed":7.44,"direction":279.72},{"datetime":"2020-07-05T01:00+08:00","speed":7.35,"direction":269.74},{"datetime":"2020-07-05T02:00+08:00","speed":6.5,"direction":239.6},{"datetime":"2020-07-05T03:00+08:00","speed":5.28,"direction":225.94},{"datetime":"2020-07-05T04:00+08:00","speed":5.73,"direction":226.7},{"datetime":"2020-07-05T05:00+08:00","speed":5.92,"direction":225.79},{"datetime":"2020-07-05T06:00+08:00","speed":5.5,"direction":208.63},{"datetime":"2020-07-05T07:00+08:00","speed":6.27,"direction":188.37},{"datetime":"2020-07-05T08:00+08:00","speed":5.82,"direction":180.67},{"datetime":"2020-07-05T09:00+08:00","speed":2.6,"direction":179.93},{"datetime":"2020-07-05T10:00+08:00","speed":0.69,"direction":239.7},{"datetime":"2020-07-05T11:00+08:00","speed":1.54,"direction":300.28},{"datetime":"2020-07-05T12:00+08:00","speed":1.68,"direction":347.14},{"datetime":"2020-07-05T13:00+08:00","speed":1.11,"direction":16}],"humidity":[{"datetime":"2020-07-03T14:00+08:00","value":0.7},{"datetime":"2020-07-03T15:00+08:00","value":0.7},{"datetime":"2020-07-03T16:00+08:00","value":0.73},{"datetime":"2020-07-03T17:00+08:00","value":0.76},{"datetime":"2020-07-03T18:00+08:00","value":0.78},{"datetime":"2020-07-03T19:00+08:00","value":0.81},{"datetime":"2020-07-03T20:00+08:00","value":0.82},{"datetime":"2020-07-03T21:00+08:00","value":0.82},{"datetime":"2020-07-03T22:00+08:00","value":0.82},{"datetime":"2020-07-03T23:00+08:00","value":0.83},{"datetime":"2020-07-04T00:00+08:00","value":0.83},{"datetime":"2020-07-04T01:00+08:00","value":0.84},{"datetime":"2020-07-04T02:00+08:00","value":0.83},{"datetime":"2020-07-04T03:00+08:00","value":0.84},{"datetime":"2020-07-04T04:00+08:00","value":0.84},{"datetime":"2020-07-04T05:00+08:00","value":0.83},{"datetime":"2020-07-04T06:00+08:00","value":0.83},{"datetime":"2020-07-04T07:00+08:00","value":0.81},{"datetime":"2020-07-04T08:00+08:00","value":0.79},{"datetime":"2020-07-04T09:00+08:00","value":0.74},{"datetime":"2020-07-04T10:00+08:00","value":0.71},{"datetime":"2020-07-04T11:00+08:00","value":0.68},{"datetime":"2020-07-04T12:00+08:00","value":0.66},{"datetime":"2020-07-04T13:00+08:00","value":0.66},{"datetime":"2020-07-04T14:00+08:00","value":0.7},{"datetime":"2020-07-04T15:00+08:00","value":0.69},{"datetime":"2020-07-04T16:00+08:00","value":0.7},{"datetime":"2020-07-04T17:00+08:00","value":0.74},{"datetime":"2020-07-04T18:00+08:00","value":0.78},{"datetime":"2020-07-04T19:00+08:00","value":0.8},{"datetime":"2020-07-04T20:00+08:00","value":0.81},{"datetime":"2020-07-04T21:00+08:00","value":0.82},{"datetime":"2020-07-04T22:00+08:00","value":0.82},{"datetime":"2020-07-04T23:00+08:00","value":0.81},{"datetime":"2020-07-05T00:00+08:00","value":0.81},{"datetime":"2020-07-05T01:00+08:00","value":0.82},{"datetime":"2020-07-05T02:00+08:00","value":0.83},{"datetime":"2020-07-05T03:00+08:00","value":0.82},{"datetime":"2020-07-05T04:00+08:00","value":0.83},{"datetime":"2020-07-05T05:00+08:00","value":0.83},{"datetime":"2020-07-05T06:00+08:00","value":0.82},{"datetime":"2020-07-05T07:00+08:00","value":0.78},{"datetime":"2020-07-05T08:00+08:00","value":0.74},{"datetime":"2020-07-05T09:00+08:00","value":0.7},{"datetime":"2020-07-05T10:00+08:00","value":0.67},{"datetime":"2020-07-05T11:00+08:00","value":0.66},{"datetime":"2020-07-05T12:00+08:00","value":0.67},{"datetime":"2020-07-05T13:00+08:00","value":0.68}],"cloudrate":[{"datetime":"2020-07-03T14:00+08:00","value":0.9},{"datetime":"2020-07-03T15:00+08:00","value":0.9},{"datetime":"2020-07-03T16:00+08:00","value":1},{"datetime":"2020-07-03T17:00+08:00","value":0.99},{"datetime":"2020-07-03T18:00+08:00","value":0.98},{"datetime":"2020-07-03T19:00+08:00","value":0.98},{"datetime":"2020-07-03T20:00+08:00","value":0.98},{"datetime":"2020-07-03T21:00+08:00","value":1},{"datetime":"2020-07-03T22:00+08:00","value":1},{"datetime":"2020-07-03T23:00+08:00","value":1},{"datetime":"2020-07-04T00:00+08:00","value":1},{"datetime":"2020-07-04T01:00+08:00","value":1},{"datetime":"2020-07-04T02:00+08:00","value":0.97},{"datetime":"2020-07-04T03:00+08:00","value":1},{"datetime":"2020-07-04T04:00+08:00","value":1},{"datetime":"2020-07-04T05:00+08:00","value":0.99},{"datetime":"2020-07-04T06:00+08:00","value":0.98},{"datetime":"2020-07-04T07:00+08:00","value":0.98},{"datetime":"2020-07-04T08:00+08:00","value":0.99},{"datetime":"2020-07-04T09:00+08:00","value":1},{"datetime":"2020-07-04T10:00+08:00","value":1},{"datetime":"2020-07-04T11:00+08:00","value":0.94},{"datetime":"2020-07-04T12:00+08:00","value":0.75},{"datetime":"2020-07-04T13:00+08:00","value":0.72},{"datetime":"2020-07-04T14:00+08:00","value":0.72},{"datetime":"2020-07-04T15:00+08:00","value":0.28},{"datetime":"2020-07-04T16:00+08:00","value":0.52},{"datetime":"2020-07-04T17:00+08:00","value":0.54},{"datetime":"2020-07-04T18:00+08:00","value":0.63},{"datetime":"2020-07-04T19:00+08:00","value":0.7},{"datetime":"2020-07-04T20:00+08:00","value":0.75},{"datetime":"2020-07-04T21:00+08:00","value":1},{"datetime":"2020-07-04T22:00+08:00","value":1},{"datetime":"2020-07-04T23:00+08:00","value":1},{"datetime":"2020-07-05T00:00+08:00","value":1},{"datetime":"2020-07-05T01:00+08:00","value":1},{"datetime":"2020-07-05T02:00+08:00","value":1},{"datetime":"2020-07-05T03:00+08:00","value":1},{"datetime":"2020-07-05T04:00+08:00","value":0.98},{"datetime":"2020-07-05T05:00+08:00","value":0.98},{"datetime":"2020-07-05T06:00+08:00","value":0.99},{"datetime":"2020-07-05T07:00+08:00","value":0.99},{"datetime":"2020-07-05T08:00+08:00","value":0.98},{"datetime":"2020-07-05T09:00+08:00","value":0.07},{"datetime":"2020-07-05T10:00+08:00","value":0.24},{"datetime":"2020-07-05T11:00+08:00","value":0.46},{"datetime":"2020-07-05T12:00+08:00","value":0.59},{"datetime":"2020-07-05T13:00+08:00","value":0.68}],"skycon":[{"datetime":"2020-07-03T14:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-03T15:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-03T16:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-03T17:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-03T18:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-03T19:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-03T20:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-03T21:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-03T22:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-03T23:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-04T00:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-04T01:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-04T02:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-04T03:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-04T04:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-04T05:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-04T06:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-04T07:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-04T08:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-04T09:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-04T10:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-04T11:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-04T12:00+08:00","value":"PARTLY_CLOUDY_DAY"},{"datetime":"2020-07-04T13:00+08:00","value":"PARTLY_CLOUDY_DAY"},{"datetime":"2020-07-04T14:00+08:00","value":"PARTLY_CLOUDY_DAY"},{"datetime":"2020-07-04T15:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-07-04T16:00+08:00","value":"MODERATE_RAIN"},{"datetime":"2020-07-04T17:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-07-04T18:00+08:00","value":"PARTLY_CLOUDY_DAY"},{"datetime":"2020-07-04T19:00+08:00","value":"PARTLY_CLOUDY_NIGHT"},{"datetime":"2020-07-04T20:00+08:00","value":"PARTLY_CLOUDY_NIGHT"},{"datetime":"2020-07-04T21:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-04T22:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-04T23:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-05T00:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-05T01:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-05T02:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-05T03:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-05T04:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-05T05:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-05T06:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-05T07:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-05T08:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-05T09:00+08:00","value":"CLEAR_DAY"},{"datetime":"2020-07-05T10:00+08:00","value":"PARTLY_CLOUDY_DAY"},{"datetime":"2020-07-05T11:00+08:00","value":"PARTLY_CLOUDY_DAY"},{"datetime":"2020-07-05T12:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-07-05T13:00+08:00","value":"LIGHT_RAIN"}],"pressure":[{"datetime":"2020-07-03T14:00+08:00","value":99214.9624832001},{"datetime":"2020-07-03T15:00+08:00","value":99184.2899968001},{"datetime":"2020-07-03T16:00+08:00","value":99233.9539968001},{"datetime":"2020-07-03T17:00+08:00","value":99245.5544832001},{"datetime":"2020-07-03T18:00+08:00","value":99313.9539968001},{"datetime":"2020-07-03T19:00+08:00","value":99325.5544832001},{"datetime":"2020-07-03T20:00+08:00","value":99325.5544832001},{"datetime":"2020-07-03T21:00+08:00","value":99405.5544832001},{"datetime":"2020-07-03T22:00+08:00","value":99405.5544832001},{"datetime":"2020-07-03T23:00+08:00","value":99405.5544832001},{"datetime":"2020-07-04T00:00+08:00","value":99355.8904832001},{"datetime":"2020-07-04T01:00+08:00","value":99325.5544832001},{"datetime":"2020-07-04T02:00+08:00","value":99245.5544832001},{"datetime":"2020-07-04T03:00+08:00","value":99245.5544832},{"datetime":"2020-07-04T04:00+08:00","value":99275.8904832001},{"datetime":"2020-07-04T05:00+08:00","value":99325.5544832001},{"datetime":"2020-07-04T06:00+08:00","value":99325.5544832001},{"datetime":"2020-07-04T07:00+08:00","value":99325.5544832001},{"datetime":"2020-07-04T08:00+08:00","value":99325.5544832001},{"datetime":"2020-07-04T09:00+08:00","value":99386.5629696001},{"datetime":"2020-07-04T10:00+08:00","value":99405.5544832001},{"datetime":"2020-07-04T11:00+08:00","value":99356.2269696001},{"datetime":"2020-07-04T12:00+08:00","value":99313.9539968001},{"datetime":"2020-07-04T13:00+08:00","value":99215.2184832001},{"datetime":"2020-07-04T14:00+08:00","value":99104.6264832001},{"datetime":"2020-07-04T15:00+08:00","value":99073.9539968001},{"datetime":"2020-07-04T16:00+08:00","value":99005.5544832001},{"datetime":"2020-07-04T17:00+08:00","value":99073.9539968001},{"datetime":"2020-07-04T18:00+08:00","value":99104.2899968001},{"datetime":"2020-07-04T19:00+08:00","value":99104.2899968},{"datetime":"2020-07-04T20:00+08:00","value":99134.8819968001},{"datetime":"2020-07-04T21:00+08:00","value":99134.8819968001},{"datetime":"2020-07-04T22:00+08:00","value":99165.5544832},{"datetime":"2020-07-04T23:00+08:00","value":99165.5544832001},{"datetime":"2020-07-05T00:00+08:00","value":99165.5544832001},{"datetime":"2020-07-05T01:00+08:00","value":99085.5544832001},{"datetime":"2020-07-05T02:00+08:00","value":99005.5544832001},{"datetime":"2020-07-05T03:00+08:00","value":99005.5544832001},{"datetime":"2020-07-05T04:00+08:00","value":99005.5544832},{"datetime":"2020-07-05T05:00+08:00","value":99005.5544832001},{"datetime":"2020-07-05T06:00+08:00","value":99066.5629696001},{"datetime":"2020-07-05T07:00+08:00","value":99085.5544832001},{"datetime":"2020-07-05T08:00+08:00","value":99085.5544832001},{"datetime":"2020-07-05T09:00+08:00","value":99085.5544832001},{"datetime":"2020-07-05T10:00+08:00","value":99066.5629696001},{"datetime":"2020-07-05T11:00+08:00","value":99005.5544832001},{"datetime":"2020-07-05T12:00+08:00","value":98993.9539968001},{"datetime":"2020-07-05T13:00+08:00","value":98956.2269696001}],"visibility":[{"datetime":"2020-07-03T14:00+08:00","value":16},{"datetime":"2020-07-03T15:00+08:00","value":15.26},{"datetime":"2020-07-03T16:00+08:00","value":12.22},{"datetime":"2020-07-03T17:00+08:00","value":10.15},{"datetime":"2020-07-03T18:00+08:00","value":8.66},{"datetime":"2020-07-03T19:00+08:00","value":7.54},{"datetime":"2020-07-03T20:00+08:00","value":7.35},{"datetime":"2020-07-03T21:00+08:00","value":7.3},{"datetime":"2020-07-03T22:00+08:00","value":7.21},{"datetime":"2020-07-03T23:00+08:00","value":7.09},{"datetime":"2020-07-04T00:00+08:00","value":7.04},{"datetime":"2020-07-04T01:00+08:00","value":6.64},{"datetime":"2020-07-04T02:00+08:00","value":6.9},{"datetime":"2020-07-04T03:00+08:00","value":6.68},{"datetime":"2020-07-04T04:00+08:00","value":6.75},{"datetime":"2020-07-04T05:00+08:00","value":6.93},{"datetime":"2020-07-04T06:00+08:00","value":7.09},{"datetime":"2020-07-04T07:00+08:00","value":7.72},{"datetime":"2020-07-04T08:00+08:00","value":8.54},{"datetime":"2020-07-04T09:00+08:00","value":11.63},{"datetime":"2020-07-04T10:00+08:00","value":14.54},{"datetime":"2020-07-04T11:00+08:00","value":16},{"datetime":"2020-07-04T12:00+08:00","value":16},{"datetime":"2020-07-04T13:00+08:00","value":16},{"datetime":"2020-07-04T14:00+08:00","value":16},{"datetime":"2020-07-04T15:00+08:00","value":16},{"datetime":"2020-07-04T16:00+08:00","value":15.5},{"datetime":"2020-07-04T17:00+08:00","value":11.78},{"datetime":"2020-07-04T18:00+08:00","value":8.94},{"datetime":"2020-07-04T19:00+08:00","value":7.89},{"datetime":"2020-07-04T20:00+08:00","value":7.5},{"datetime":"2020-07-04T21:00+08:00","value":7.2},{"datetime":"2020-07-04T22:00+08:00","value":7.28},{"datetime":"2020-07-04T23:00+08:00","value":7.68},{"datetime":"2020-07-05T00:00+08:00","value":7.59},{"datetime":"2020-07-05T01:00+08:00","value":7.33},{"datetime":"2020-07-05T02:00+08:00","value":7.11},{"datetime":"2020-07-05T03:00+08:00","value":7.13},{"datetime":"2020-07-05T04:00+08:00","value":6.9},{"datetime":"2020-07-05T05:00+08:00","value":6.97},{"datetime":"2020-07-05T06:00+08:00","value":7.28},{"datetime":"2020-07-05T07:00+08:00","value":8.83},{"datetime":"2020-07-05T08:00+08:00","value":11.1},{"datetime":"2020-07-05T09:00+08:00","value":15.34},{"datetime":"2020-07-05T10:00+08:00","value":16},{"datetime":"2020-07-05T11:00+08:00","value":16},{"datetime":"2020-07-05T12:00+08:00","value":16},{"datetime":"2020-07-05T13:00+08:00","value":16}],"dswrf":[{"datetime":"2020-07-03T14:00+08:00","value":763.83973376},{"datetime":"2020-07-03T15:00+08:00","value":644.1420544},{"datetime":"2020-07-03T16:00+08:00","value":566.8689664},{"datetime":"2020-07-03T17:00+08:00","value":480.3693312},{"datetime":"2020-07-03T18:00+08:00","value":389.9195136},{"datetime":"2020-07-03T19:00+08:00","value":314.2276352},{"datetime":"2020-07-03T20:00+08:00","value":263.17904128},{"datetime":"2020-07-03T21:00+08:00","value":0},{"datetime":"2020-07-03T22:00+08:00","value":0},{"datetime":"2020-07-03T23:00+08:00","value":0},{"datetime":"2020-07-04T00:00+08:00","value":0},{"datetime":"2020-07-04T01:00+08:00","value":0},{"datetime":"2020-07-04T02:00+08:00","value":0},{"datetime":"2020-07-04T03:00+08:00","value":0},{"datetime":"2020-07-04T04:00+08:00","value":0},{"datetime":"2020-07-04T05:00+08:00","value":0},{"datetime":"2020-07-04T06:00+08:00","value":10},{"datetime":"2020-07-04T07:00+08:00","value":40},{"datetime":"2020-07-04T08:00+08:00","value":84.31620608},{"datetime":"2020-07-04T09:00+08:00","value":473.099392},{"datetime":"2020-07-04T10:00+08:00","value":566.125696},{"datetime":"2020-07-04T11:00+08:00","value":664.10681088},{"datetime":"2020-07-04T12:00+08:00","value":739.26613248},{"datetime":"2020-07-04T13:00+08:00","value":783.66202368},{"datetime":"2020-07-04T14:00+08:00","value":803.0214784},{"datetime":"2020-07-04T15:00+08:00","value":761.739392},{"datetime":"2020-07-04T16:00+08:00","value":677.915392},{"datetime":"2020-07-04T17:00+08:00","value":567.0975744},{"datetime":"2020-07-04T18:00+08:00","value":452.4036352},{"datetime":"2020-07-04T19:00+08:00","value":367.645696},{"datetime":"2020-07-04T20:00+08:00","value":306.50096896},{"datetime":"2020-07-04T21:00+08:00","value":0},{"datetime":"2020-07-04T22:00+08:00","value":0},{"datetime":"2020-07-04T23:00+08:00","value":0},{"datetime":"2020-07-05T00:00+08:00","value":0},{"datetime":"2020-07-05T01:00+08:00","value":0},{"datetime":"2020-07-05T02:00+08:00","value":0},{"datetime":"2020-07-05T03:00+08:00","value":0},{"datetime":"2020-07-05T04:00+08:00","value":0},{"datetime":"2020-07-05T05:00+08:00","value":0},{"datetime":"2020-07-05T06:00+08:00","value":10},{"datetime":"2020-07-05T07:00+08:00","value":40},{"datetime":"2020-07-05T08:00+08:00","value":96.79986688},{"datetime":"2020-07-05T09:00+08:00","value":632.3419392},{"datetime":"2020-07-05T10:00+08:00","value":709.0761216},{"datetime":"2020-07-05T11:00+08:00","value":749.00631552},{"datetime":"2020-07-05T12:00+08:00","value":766.63351552},{"datetime":"2020-07-05T13:00+08:00","value":760.24050944}],"air_quality":{"aqi":[{"datetime":"2020-07-03T14:00+08:00","value":{"chn":8,"usa":8}},{"datetime":"2020-07-03T15:00+08:00","value":{"chn":8,"usa":8}},{"datetime":"2020-07-03T16:00+08:00","value":{"chn":7,"usa":7}},{"datetime":"2020-07-03T17:00+08:00","value":{"chn":7,"usa":7}},{"datetime":"2020-07-03T18:00+08:00","value":{"chn":7,"usa":7}},{"datetime":"2020-07-03T19:00+08:00","value":{"chn":8,"usa":8}},{"datetime":"2020-07-03T20:00+08:00","value":{"chn":8,"usa":8}},{"datetime":"2020-07-03T21:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-07-03T22:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-07-03T23:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-07-04T00:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-07-04T01:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-07-04T02:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-07-04T03:00+08:00","value":{"chn":11,"usa":11}},{"datetime":"2020-07-04T04:00+08:00","value":{"chn":11,"usa":11}},{"datetime":"2020-07-04T05:00+08:00","value":{"chn":11,"usa":11}},{"datetime":"2020-07-04T06:00+08:00","value":{"chn":11,"usa":11}},{"datetime":"2020-07-04T07:00+08:00","value":{"chn":11,"usa":11}},{"datetime":"2020-07-04T08:00+08:00","value":{"chn":11,"usa":11}},{"datetime":"2020-07-04T09:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-07-04T10:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-07-04T11:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-07-04T12:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-07-04T13:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-07-04T14:00+08:00","value":{"chn":8,"usa":8}},{"datetime":"2020-07-04T15:00+08:00","value":{"chn":8,"usa":8}},{"datetime":"2020-07-04T16:00+08:00","value":{"chn":7,"usa":7}},{"datetime":"2020-07-04T17:00+08:00","value":{"chn":7,"usa":7}},{"datetime":"2020-07-04T18:00+08:00","value":{"chn":8,"usa":8}},{"datetime":"2020-07-04T19:00+08:00","value":{"chn":8,"usa":8}},{"datetime":"2020-07-04T20:00+08:00","value":{"chn":8,"usa":8}},{"datetime":"2020-07-04T21:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-07-04T22:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-07-04T23:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-07-05T00:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-07-05T01:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-07-05T02:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-07-05T03:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-07-05T04:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-07-05T05:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-07-05T06:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-07-05T07:00+08:00","value":{"chn":8,"usa":8}},{"datetime":"2020-07-05T08:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-07-05T09:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-07-05T10:00+08:00","value":{"chn":8,"usa":8}},{"datetime":"2020-07-05T11:00+08:00","value":{"chn":8,"usa":8}},{"datetime":"2020-07-05T12:00+08:00","value":{"chn":8,"usa":8}},{"datetime":"2020-07-05T13:00+08:00","value":{"chn":7,"usa":7}}],"pm25":[{"datetime":"2020-07-03T14:00+08:00","value":3},{"datetime":"2020-07-03T15:00+08:00","value":4},{"datetime":"2020-07-03T16:00+08:00","value":4},{"datetime":"2020-07-03T17:00+08:00","value":4},{"datetime":"2020-07-03T18:00+08:00","value":5},{"datetime":"2020-07-03T19:00+08:00","value":5},{"datetime":"2020-07-03T20:00+08:00","value":6},{"datetime":"2020-07-03T21:00+08:00","value":7},{"datetime":"2020-07-03T22:00+08:00","value":7},{"datetime":"2020-07-03T23:00+08:00","value":7},{"datetime":"2020-07-04T00:00+08:00","value":8},{"datetime":"2020-07-04T01:00+08:00","value":8},{"datetime":"2020-07-04T02:00+08:00","value":8},{"datetime":"2020-07-04T03:00+08:00","value":7},{"datetime":"2020-07-04T04:00+08:00","value":7},{"datetime":"2020-07-04T05:00+08:00","value":7},{"datetime":"2020-07-04T06:00+08:00","value":7},{"datetime":"2020-07-04T07:00+08:00","value":8},{"datetime":"2020-07-04T08:00+08:00","value":8},{"datetime":"2020-07-04T09:00+08:00","value":9},{"datetime":"2020-07-04T10:00+08:00","value":8},{"datetime":"2020-07-04T11:00+08:00","value":7},{"datetime":"2020-07-04T12:00+08:00","value":6},{"datetime":"2020-07-04T13:00+08:00","value":6},{"datetime":"2020-07-04T14:00+08:00","value":6},{"datetime":"2020-07-04T15:00+08:00","value":5},{"datetime":"2020-07-04T16:00+08:00","value":5},{"datetime":"2020-07-04T17:00+08:00","value":5},{"datetime":"2020-07-04T18:00+08:00","value":5},{"datetime":"2020-07-04T19:00+08:00","value":5},{"datetime":"2020-07-04T20:00+08:00","value":6},{"datetime":"2020-07-04T21:00+08:00","value":7},{"datetime":"2020-07-04T22:00+08:00","value":7},{"datetime":"2020-07-04T23:00+08:00","value":7},{"datetime":"2020-07-05T00:00+08:00","value":7},{"datetime":"2020-07-05T01:00+08:00","value":8},{"datetime":"2020-07-05T02:00+08:00","value":8},{"datetime":"2020-07-05T03:00+08:00","value":8},{"datetime":"2020-07-05T04:00+08:00","value":7},{"datetime":"2020-07-05T05:00+08:00","value":7},{"datetime":"2020-07-05T06:00+08:00","value":6},{"datetime":"2020-07-05T07:00+08:00","value":6},{"datetime":"2020-07-05T08:00+08:00","value":6},{"datetime":"2020-07-05T09:00+08:00","value":6},{"datetime":"2020-07-05T10:00+08:00","value":6},{"datetime":"2020-07-05T11:00+08:00","value":6},{"datetime":"2020-07-05T12:00+08:00","value":6},{"datetime":"2020-07-05T13:00+08:00","value":5}]}},"daily":{"status":"ok","astro":[{"date":"2020-07-03T00:00+08:00","sunrise":{"time":"05:07"},"sunset":{"time":"18:47"}},{"date":"2020-07-04T00:00+08:00","sunrise":{"time":"05:08"},"sunset":{"time":"18:47"}},{"date":"2020-07-05T00:00+08:00","sunrise":{"time":"05:08"},"sunset":{"time":"18:47"}},{"date":"2020-07-06T00:00+08:00","sunrise":{"time":"05:08"},"sunset":{"time":"18:47"}},{"date":"2020-07-07T00:00+08:00","sunrise":{"time":"05:09"},"sunset":{"time":"18:47"}}],"precipitation":[{"date":"2020-07-03T00:00+08:00","max":0.057,"min":0,"avg":0.0057},{"date":"2020-07-04T00:00+08:00","max":1.4291,"min":0,"avg":0.0965},{"date":"2020-07-05T00:00+08:00","max":0.8518,"min":0,"avg":0.0496},{"date":"2020-07-06T00:00+08:00","max":0.3131,"min":0,"avg":0.0564},{"date":"2020-07-07T00:00+08:00","max":1.0025,"min":0,"avg":0.1742}],"temperature":[{"date":"2020-07-03T00:00+08:00","max":32.16,"min":26,"avg":28.29},{"date":"2020-07-04T00:00+08:00","max":31,"min":26,"avg":28.93},{"date":"2020-07-05T00:00+08:00","max":31,"min":26,"avg":28.47},{"date":"2020-07-06T00:00+08:00","max":31,"min":26,"avg":28.55},{"date":"2020-07-07T00:00+08:00","max":31,"min":26,"avg":28.54}],"wind":[{"date":"2020-07-03T00:00+08:00","max":{"speed":30.96,"direction":220},"min":{"speed":0.36,"direction":282.01},"avg":{"speed":4.97,"direction":223.75}},{"date":"2020-07-04T00:00+08:00","max":{"speed":9.03,"direction":212.93},"min":{"speed":0.8,"direction":9.78},"avg":{"speed":3.58,"direction":223.6}},{"date":"2020-07-05T00:00+08:00","max":{"speed":7.44,"direction":279.72},"min":{"speed":0.51,"direction":152.85},"avg":{"speed":3.3,"direction":229.92}},{"date":"2020-07-06T00:00+08:00","max":{"speed":6.77,"direction":273.26},"min":{"speed":0.72,"direction":225.05},"avg":{"speed":3.51,"direction":240.28}},{"date":"2020-07-07T00:00+08:00","max":{"speed":7.53,"direction":263.89},"min":{"speed":0.62,"direction":122.5},"avg":{"speed":4.64,"direction":241.72}}],"humidity":[{"date":"2020-07-03T00:00+08:00","max":0.83,"min":0.67,"avg":0.78},{"date":"2020-07-04T00:00+08:00","max":0.84,"min":0.66,"avg":0.77},{"date":"2020-07-05T00:00+08:00","max":0.83,"min":0.66,"avg":0.76},{"date":"2020-07-06T00:00+08:00","max":0.83,"min":0.67,"avg":0.77},{"date":"2020-07-07T00:00+08:00","max":0.84,"min":0.67,"avg":0.76}],"cloudrate":[{"date":"2020-07-03T00:00+08:00","max":1,"min":0.85,"avg":0.97},{"date":"2020-07-04T00:00+08:00","max":1,"min":0.28,"avg":0.85},{"date":"2020-07-05T00:00+08:00","max":1,"min":0.07,"avg":0.84},{"date":"2020-07-06T00:00+08:00","max":1,"min":0.95,"avg":0.99},{"date":"2020-07-07T00:00+08:00","max":1,"min":0.82,"avg":0.98}],"pressure":[{"date":"2020-07-03T00:00+08:00","max":99405.55,"min":99165.55,"avg":99306.05},{"date":"2020-07-04T00:00+08:00","max":99405.55,"min":99005.55,"avg":99228.99},{"date":"2020-07-05T00:00+08:00","max":99165.55,"min":98814.96,"avg":98988.2},{"date":"2020-07-06T00:00+08:00","max":99245.55,"min":98864.29,"avg":99028.96},{"date":"2020-07-07T00:00+08:00","max":99405.55,"min":99115.89,"avg":99257.06}],"visibility":[{"date":"2020-07-03T00:00+08:00","max":24.13,"min":7.09,"avg":9.88},{"date":"2020-07-04T00:00+08:00","max":16,"min":6.64,"avg":10.18},{"date":"2020-07-05T00:00+08:00","max":16,"min":6.9,"avg":11.02},{"date":"2020-07-06T00:00+08:00","max":16,"min":6.92,"avg":10.49},{"date":"2020-07-07T00:00+08:00","max":16,"min":6.79,"avg":10.61}],"dswrf":[{"date":"2020-07-03T00:00+08:00","max":763.8,"min":0,"avg":342.3},{"date":"2020-07-04T00:00+08:00","max":803,"min":0,"avg":304},{"date":"2020-07-05T00:00+08:00","max":766.6,"min":0,"avg":311.5},{"date":"2020-07-06T00:00+08:00","max":786.2,"min":0,"avg":294.1},{"date":"2020-07-07T00:00+08:00","max":760.9,"min":0,"avg":278.5}],"air_quality":{"aqi":[{"date":"2020-07-03T00:00+08:00","max":{"chn":11,"usa":11},"avg":{"chn":8,"usa":8},"min":{"chn":7,"usa":7}},{"date":"2020-07-04T00:00+08:00","max":{"chn":11,"usa":11},"avg":{"chn":9.42,"usa":9.42},"min":{"chn":7,"usa":7}},{"date":"2020-07-05T00:00+08:00","max":{"chn":10,"usa":10},"avg":{"chn":8.29,"usa":8.29},"min":{"chn":7,"usa":7}},{"date":"2020-07-06T00:00+08:00","max":{"chn":10,"usa":10},"avg":{"chn":8.12,"usa":8.12},"min":{"chn":7,"usa":7}},{"date":"2020-07-07T00:00+08:00","max":{"chn":8,"usa":8},"avg":{"chn":7.62,"usa":7.62},"min":{"chn":7,"usa":7}}],"pm25":[{"date":"2020-07-03T00:00+08:00","max":7,"avg":5.2,"min":3},{"date":"2020-07-04T00:00+08:00","max":9,"avg":6.75,"min":5},{"date":"2020-07-05T00:00+08:00","max":8,"avg":5.88,"min":3},{"date":"2020-07-06T00:00+08:00","max":8,"avg":5.33,"min":3},{"date":"2020-07-07T00:00+08:00","max":5,"avg":4.08,"min":3}]},"skycon":[{"date":"2020-07-03T00:00+08:00","value":"CLOUDY"},{"date":"2020-07-04T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-07-05T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-07-06T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-07-07T00:00+08:00","value":"LIGHT_RAIN"}],"skycon_08h_20h":[{"date":"2020-07-03T00:00+08:00","value":"CLOUDY"},{"date":"2020-07-04T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-07-05T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-07-06T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-07-07T00:00+08:00","value":"LIGHT_RAIN"}],"skycon_20h_32h":[{"date":"2020-07-03T00:00+08:00","value":"CLOUDY"},{"date":"2020-07-04T00:00+08:00","value":"CLOUDY"},{"date":"2020-07-05T00:00+08:00","value":"CLOUDY"},{"date":"2020-07-06T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-07-07T00:00+08:00","value":"LIGHT_RAIN"}],"life_index":{"ultraviolet":[{"date":"2020-07-03T00:00+08:00","index":"1","desc":"最弱"},{"date":"2020-07-04T00:00+08:00","index":"1","desc":"最弱"},{"date":"2020-07-05T00:00+08:00","index":"3","desc":"中等"},{"date":"2020-07-06T00:00+08:00","index":"1","desc":"最弱"},{"date":"2020-07-07T00:00+08:00","index":"1","desc":"最弱"}],"carWashing":[{"date":"2020-07-03T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-07-04T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-07-05T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-07-06T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-07-07T00:00+08:00","index":"3","desc":"较不适宜"}],"dressing":[{"date":"2020-07-03T00:00+08:00","index":"2","desc":"很热"},{"date":"2020-07-04T00:00+08:00","index":"2","desc":"很热"},{"date":"2020-07-05T00:00+08:00","index":"2","desc":"很热"},{"date":"2020-07-06T00:00+08:00","index":"2","desc":"很热"},{"date":"2020-07-07T00:00+08:00","index":"2","desc":"很热"}],"comfort":[{"date":"2020-07-03T00:00+08:00","index":"0","desc":"闷热"},{"date":"2020-07-04T00:00+08:00","index":"0","desc":"闷热"},{"date":"2020-07-05T00:00+08:00","index":"0","desc":"闷热"},{"date":"2020-07-06T00:00+08:00","index":"0","desc":"闷热"},{"date":"2020-07-07T00:00+08:00","index":"0","desc":"闷热"}],"coldRisk":[{"date":"2020-07-03T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-07-04T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-07-05T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-07-06T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-07-07T00:00+08:00","index":"3","desc":"易发"}]}},"primary":0,"forecast_keypoint":"您北边16公里正下着暴雨呢"}
     */

    private String status;
    private String api_version;
    private String api_status;
    private String lang;
    private String unit;
    private int tzshift;
    private String timezone;
    private int server_time;
    private ResultBean result;
    private List<Double> location;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getApi_version() {
        return api_version;
    }

    public void setApi_version(String api_version) {
        this.api_version = api_version;
    }

    public String getApi_status() {
        return api_status;
    }

    public void setApi_status(String api_status) {
        this.api_status = api_status;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getTzshift() {
        return tzshift;
    }

    public void setTzshift(int tzshift) {
        this.tzshift = tzshift;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public int getServer_time() {
        return server_time;
    }

    public void setServer_time(int server_time) {
        this.server_time = server_time;
    }

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public List<Double> getLocation() {
        return location;
    }

    public void setLocation(List<Double> location) {
        this.location = location;
    }

    public static class ResultBean {
        /**
         * realtime : {"status":"ok","temperature":32.16,"humidity":0.7,"cloudrate":0.9,"skycon":"CLOUDY","visibility":16,"dswrf":763.8,"wind":{"speed":30.96,"direction":220},"pressure":99214.96,"apparent_temperature":31.8,"precipitation":{"local":{"status":"ok","datasource":"radar","intensity":0},"nearest":{"status":"ok","distance":16,"intensity":2}},"air_quality":{"pm25":3,"pm10":0,"o3":0,"so2":0,"no2":0,"co":0,"aqi":{"chn":8,"usa":0},"description":{"usa":"","chn":"优"}},"life_index":{"ultraviolet":{"index":1,"desc":"很弱"},"comfort":{"index":0,"desc":"闷热"}}}
         * minutely : {"status":"ok","datasource":"radar","precipitation_2h":[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],"precipitation":[0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0],"probability":[0,0,0,0],"description":"您北边16公里正下着暴雨呢"}
         * hourly : {"status":"ok","description":"阴，明天中午13点钟后转多云，其后云渐少","precipitation":[{"datetime":"2020-07-03T14:00+08:00","value":0},{"datetime":"2020-07-03T15:00+08:00","value":0},{"datetime":"2020-07-03T16:00+08:00","value":0.057},{"datetime":"2020-07-03T17:00+08:00","value":0},{"datetime":"2020-07-03T18:00+08:00","value":0},{"datetime":"2020-07-03T19:00+08:00","value":0},{"datetime":"2020-07-03T20:00+08:00","value":0},{"datetime":"2020-07-03T21:00+08:00","value":0},{"datetime":"2020-07-03T22:00+08:00","value":0},{"datetime":"2020-07-03T23:00+08:00","value":0},{"datetime":"2020-07-04T00:00+08:00","value":0},{"datetime":"2020-07-04T01:00+08:00","value":0},{"datetime":"2020-07-04T02:00+08:00","value":0},{"datetime":"2020-07-04T03:00+08:00","value":0},{"datetime":"2020-07-04T04:00+08:00","value":0},{"datetime":"2020-07-04T05:00+08:00","value":0},{"datetime":"2020-07-04T06:00+08:00","value":0},{"datetime":"2020-07-04T07:00+08:00","value":0},{"datetime":"2020-07-04T08:00+08:00","value":0},{"datetime":"2020-07-04T09:00+08:00","value":0},{"datetime":"2020-07-04T10:00+08:00","value":0},{"datetime":"2020-07-04T11:00+08:00","value":0},{"datetime":"2020-07-04T12:00+08:00","value":0},{"datetime":"2020-07-04T13:00+08:00","value":0},{"datetime":"2020-07-04T14:00+08:00","value":0},{"datetime":"2020-07-04T15:00+08:00","value":0.5845},{"datetime":"2020-07-04T16:00+08:00","value":1.4291},{"datetime":"2020-07-04T17:00+08:00","value":0.3017},{"datetime":"2020-07-04T18:00+08:00","value":0},{"datetime":"2020-07-04T19:00+08:00","value":0},{"datetime":"2020-07-04T20:00+08:00","value":0},{"datetime":"2020-07-04T21:00+08:00","value":0},{"datetime":"2020-07-04T22:00+08:00","value":0},{"datetime":"2020-07-04T23:00+08:00","value":0},{"datetime":"2020-07-05T00:00+08:00","value":0},{"datetime":"2020-07-05T01:00+08:00","value":0},{"datetime":"2020-07-05T02:00+08:00","value":0},{"datetime":"2020-07-05T03:00+08:00","value":0},{"datetime":"2020-07-05T04:00+08:00","value":0},{"datetime":"2020-07-05T05:00+08:00","value":0},{"datetime":"2020-07-05T06:00+08:00","value":0},{"datetime":"2020-07-05T07:00+08:00","value":0},{"datetime":"2020-07-05T08:00+08:00","value":0},{"datetime":"2020-07-05T09:00+08:00","value":0},{"datetime":"2020-07-05T10:00+08:00","value":0},{"datetime":"2020-07-05T11:00+08:00","value":0},{"datetime":"2020-07-05T12:00+08:00","value":0.0653},{"datetime":"2020-07-05T13:00+08:00","value":0.8518}],"temperature":[{"datetime":"2020-07-03T14:00+08:00","value":32.16},{"datetime":"2020-07-03T15:00+08:00","value":30.8},{"datetime":"2020-07-03T16:00+08:00","value":30.14},{"datetime":"2020-07-03T17:00+08:00","value":28.68},{"datetime":"2020-07-03T18:00+08:00","value":28.12},{"datetime":"2020-07-03T19:00+08:00","value":27.56},{"datetime":"2020-07-03T20:00+08:00","value":26.5},{"datetime":"2020-07-03T21:00+08:00","value":26.4},{"datetime":"2020-07-03T22:00+08:00","value":26.3},{"datetime":"2020-07-03T23:00+08:00","value":26.2},{"datetime":"2020-07-04T00:00+08:00","value":26.1},{"datetime":"2020-07-04T01:00+08:00","value":26},{"datetime":"2020-07-04T02:00+08:00","value":26.5},{"datetime":"2020-07-04T03:00+08:00","value":27},{"datetime":"2020-07-04T04:00+08:00","value":27.5},{"datetime":"2020-07-04T05:00+08:00","value":28},{"datetime":"2020-07-04T06:00+08:00","value":28.5},{"datetime":"2020-07-04T07:00+08:00","value":29},{"datetime":"2020-07-04T08:00+08:00","value":29.5},{"datetime":"2020-07-04T09:00+08:00","value":30},{"datetime":"2020-07-04T10:00+08:00","value":30.5},{"datetime":"2020-07-04T11:00+08:00","value":31},{"datetime":"2020-07-04T12:00+08:00","value":31},{"datetime":"2020-07-04T13:00+08:00","value":30.8},{"datetime":"2020-07-04T14:00+08:00","value":31},{"datetime":"2020-07-04T15:00+08:00","value":30.9},{"datetime":"2020-07-04T16:00+08:00","value":30.74},{"datetime":"2020-07-04T17:00+08:00","value":30.28},{"datetime":"2020-07-04T18:00+08:00","value":29.77},{"datetime":"2020-07-04T19:00+08:00","value":29.2},{"datetime":"2020-07-04T20:00+08:00","value":28.44},{"datetime":"2020-07-04T21:00+08:00","value":27.86},{"datetime":"2020-07-04T22:00+08:00","value":27.5},{"datetime":"2020-07-04T23:00+08:00","value":27.23},{"datetime":"2020-07-05T00:00+08:00","value":26.88},{"datetime":"2020-07-05T01:00+08:00","value":26.54},{"datetime":"2020-07-05T02:00+08:00","value":26.75},{"datetime":"2020-07-05T03:00+08:00","value":27},{"datetime":"2020-07-05T04:00+08:00","value":27.29},{"datetime":"2020-07-05T05:00+08:00","value":26},{"datetime":"2020-07-05T06:00+08:00","value":28.01},{"datetime":"2020-07-05T07:00+08:00","value":28.25},{"datetime":"2020-07-05T08:00+08:00","value":28.39},{"datetime":"2020-07-05T09:00+08:00","value":28.39},{"datetime":"2020-07-05T10:00+08:00","value":28.51},{"datetime":"2020-07-05T11:00+08:00","value":31},{"datetime":"2020-07-05T12:00+08:00","value":29.45},{"datetime":"2020-07-05T13:00+08:00","value":30}],"wind":[{"datetime":"2020-07-03T14:00+08:00","speed":30.96,"direction":220},{"datetime":"2020-07-03T15:00+08:00","speed":5.84,"direction":325.62},{"datetime":"2020-07-03T16:00+08:00","speed":2.73,"direction":344.64},{"datetime":"2020-07-03T17:00+08:00","speed":2.36,"direction":2.37},{"datetime":"2020-07-03T18:00+08:00","speed":1.34,"direction":19.52},{"datetime":"2020-07-03T19:00+08:00","speed":0.36,"direction":282.01},{"datetime":"2020-07-03T20:00+08:00","speed":2,"direction":301.51},{"datetime":"2020-07-03T21:00+08:00","speed":2.98,"direction":291.2},{"datetime":"2020-07-03T22:00+08:00","speed":2.87,"direction":244.97},{"datetime":"2020-07-03T23:00+08:00","speed":4.59,"direction":181.87},{"datetime":"2020-07-04T00:00+08:00","speed":4.69,"direction":179.06},{"datetime":"2020-07-04T01:00+08:00","speed":3.48,"direction":234.46},{"datetime":"2020-07-04T02:00+08:00","speed":5.33,"direction":276.95},{"datetime":"2020-07-04T03:00+08:00","speed":6.65,"direction":261.95},{"datetime":"2020-07-04T04:00+08:00","speed":8.67,"direction":230.12},{"datetime":"2020-07-04T05:00+08:00","speed":9.03,"direction":212.93},{"datetime":"2020-07-04T06:00+08:00","speed":7.9,"direction":200.79},{"datetime":"2020-07-04T07:00+08:00","speed":6.5,"direction":204.72},{"datetime":"2020-07-04T08:00+08:00","speed":4.54,"direction":222.73},{"datetime":"2020-07-04T09:00+08:00","speed":2.23,"direction":292.57},{"datetime":"2020-07-04T10:00+08:00","speed":2.37,"direction":325.36},{"datetime":"2020-07-04T11:00+08:00","speed":1.55,"direction":313.83},{"datetime":"2020-07-04T12:00+08:00","speed":0.96,"direction":6.95},{"datetime":"2020-07-04T13:00+08:00","speed":0.8,"direction":9.78},{"datetime":"2020-07-04T14:00+08:00","speed":1.71,"direction":76.65},{"datetime":"2020-07-04T15:00+08:00","speed":2.1,"direction":77.64},{"datetime":"2020-07-04T16:00+08:00","speed":1.65,"direction":69.79},{"datetime":"2020-07-04T17:00+08:00","speed":2.14,"direction":109.39},{"datetime":"2020-07-04T18:00+08:00","speed":1.44,"direction":120.32},{"datetime":"2020-07-04T19:00+08:00","speed":1.51,"direction":149.7},{"datetime":"2020-07-04T20:00+08:00","speed":1.87,"direction":170.36},{"datetime":"2020-07-04T21:00+08:00","speed":2.52,"direction":161.83},{"datetime":"2020-07-04T22:00+08:00","speed":1.48,"direction":233.32},{"datetime":"2020-07-04T23:00+08:00","speed":4.89,"direction":284.63},{"datetime":"2020-07-05T00:00+08:00","speed":7.44,"direction":279.72},{"datetime":"2020-07-05T01:00+08:00","speed":7.35,"direction":269.74},{"datetime":"2020-07-05T02:00+08:00","speed":6.5,"direction":239.6},{"datetime":"2020-07-05T03:00+08:00","speed":5.28,"direction":225.94},{"datetime":"2020-07-05T04:00+08:00","speed":5.73,"direction":226.7},{"datetime":"2020-07-05T05:00+08:00","speed":5.92,"direction":225.79},{"datetime":"2020-07-05T06:00+08:00","speed":5.5,"direction":208.63},{"datetime":"2020-07-05T07:00+08:00","speed":6.27,"direction":188.37},{"datetime":"2020-07-05T08:00+08:00","speed":5.82,"direction":180.67},{"datetime":"2020-07-05T09:00+08:00","speed":2.6,"direction":179.93},{"datetime":"2020-07-05T10:00+08:00","speed":0.69,"direction":239.7},{"datetime":"2020-07-05T11:00+08:00","speed":1.54,"direction":300.28},{"datetime":"2020-07-05T12:00+08:00","speed":1.68,"direction":347.14},{"datetime":"2020-07-05T13:00+08:00","speed":1.11,"direction":16}],"humidity":[{"datetime":"2020-07-03T14:00+08:00","value":0.7},{"datetime":"2020-07-03T15:00+08:00","value":0.7},{"datetime":"2020-07-03T16:00+08:00","value":0.73},{"datetime":"2020-07-03T17:00+08:00","value":0.76},{"datetime":"2020-07-03T18:00+08:00","value":0.78},{"datetime":"2020-07-03T19:00+08:00","value":0.81},{"datetime":"2020-07-03T20:00+08:00","value":0.82},{"datetime":"2020-07-03T21:00+08:00","value":0.82},{"datetime":"2020-07-03T22:00+08:00","value":0.82},{"datetime":"2020-07-03T23:00+08:00","value":0.83},{"datetime":"2020-07-04T00:00+08:00","value":0.83},{"datetime":"2020-07-04T01:00+08:00","value":0.84},{"datetime":"2020-07-04T02:00+08:00","value":0.83},{"datetime":"2020-07-04T03:00+08:00","value":0.84},{"datetime":"2020-07-04T04:00+08:00","value":0.84},{"datetime":"2020-07-04T05:00+08:00","value":0.83},{"datetime":"2020-07-04T06:00+08:00","value":0.83},{"datetime":"2020-07-04T07:00+08:00","value":0.81},{"datetime":"2020-07-04T08:00+08:00","value":0.79},{"datetime":"2020-07-04T09:00+08:00","value":0.74},{"datetime":"2020-07-04T10:00+08:00","value":0.71},{"datetime":"2020-07-04T11:00+08:00","value":0.68},{"datetime":"2020-07-04T12:00+08:00","value":0.66},{"datetime":"2020-07-04T13:00+08:00","value":0.66},{"datetime":"2020-07-04T14:00+08:00","value":0.7},{"datetime":"2020-07-04T15:00+08:00","value":0.69},{"datetime":"2020-07-04T16:00+08:00","value":0.7},{"datetime":"2020-07-04T17:00+08:00","value":0.74},{"datetime":"2020-07-04T18:00+08:00","value":0.78},{"datetime":"2020-07-04T19:00+08:00","value":0.8},{"datetime":"2020-07-04T20:00+08:00","value":0.81},{"datetime":"2020-07-04T21:00+08:00","value":0.82},{"datetime":"2020-07-04T22:00+08:00","value":0.82},{"datetime":"2020-07-04T23:00+08:00","value":0.81},{"datetime":"2020-07-05T00:00+08:00","value":0.81},{"datetime":"2020-07-05T01:00+08:00","value":0.82},{"datetime":"2020-07-05T02:00+08:00","value":0.83},{"datetime":"2020-07-05T03:00+08:00","value":0.82},{"datetime":"2020-07-05T04:00+08:00","value":0.83},{"datetime":"2020-07-05T05:00+08:00","value":0.83},{"datetime":"2020-07-05T06:00+08:00","value":0.82},{"datetime":"2020-07-05T07:00+08:00","value":0.78},{"datetime":"2020-07-05T08:00+08:00","value":0.74},{"datetime":"2020-07-05T09:00+08:00","value":0.7},{"datetime":"2020-07-05T10:00+08:00","value":0.67},{"datetime":"2020-07-05T11:00+08:00","value":0.66},{"datetime":"2020-07-05T12:00+08:00","value":0.67},{"datetime":"2020-07-05T13:00+08:00","value":0.68}],"cloudrate":[{"datetime":"2020-07-03T14:00+08:00","value":0.9},{"datetime":"2020-07-03T15:00+08:00","value":0.9},{"datetime":"2020-07-03T16:00+08:00","value":1},{"datetime":"2020-07-03T17:00+08:00","value":0.99},{"datetime":"2020-07-03T18:00+08:00","value":0.98},{"datetime":"2020-07-03T19:00+08:00","value":0.98},{"datetime":"2020-07-03T20:00+08:00","value":0.98},{"datetime":"2020-07-03T21:00+08:00","value":1},{"datetime":"2020-07-03T22:00+08:00","value":1},{"datetime":"2020-07-03T23:00+08:00","value":1},{"datetime":"2020-07-04T00:00+08:00","value":1},{"datetime":"2020-07-04T01:00+08:00","value":1},{"datetime":"2020-07-04T02:00+08:00","value":0.97},{"datetime":"2020-07-04T03:00+08:00","value":1},{"datetime":"2020-07-04T04:00+08:00","value":1},{"datetime":"2020-07-04T05:00+08:00","value":0.99},{"datetime":"2020-07-04T06:00+08:00","value":0.98},{"datetime":"2020-07-04T07:00+08:00","value":0.98},{"datetime":"2020-07-04T08:00+08:00","value":0.99},{"datetime":"2020-07-04T09:00+08:00","value":1},{"datetime":"2020-07-04T10:00+08:00","value":1},{"datetime":"2020-07-04T11:00+08:00","value":0.94},{"datetime":"2020-07-04T12:00+08:00","value":0.75},{"datetime":"2020-07-04T13:00+08:00","value":0.72},{"datetime":"2020-07-04T14:00+08:00","value":0.72},{"datetime":"2020-07-04T15:00+08:00","value":0.28},{"datetime":"2020-07-04T16:00+08:00","value":0.52},{"datetime":"2020-07-04T17:00+08:00","value":0.54},{"datetime":"2020-07-04T18:00+08:00","value":0.63},{"datetime":"2020-07-04T19:00+08:00","value":0.7},{"datetime":"2020-07-04T20:00+08:00","value":0.75},{"datetime":"2020-07-04T21:00+08:00","value":1},{"datetime":"2020-07-04T22:00+08:00","value":1},{"datetime":"2020-07-04T23:00+08:00","value":1},{"datetime":"2020-07-05T00:00+08:00","value":1},{"datetime":"2020-07-05T01:00+08:00","value":1},{"datetime":"2020-07-05T02:00+08:00","value":1},{"datetime":"2020-07-05T03:00+08:00","value":1},{"datetime":"2020-07-05T04:00+08:00","value":0.98},{"datetime":"2020-07-05T05:00+08:00","value":0.98},{"datetime":"2020-07-05T06:00+08:00","value":0.99},{"datetime":"2020-07-05T07:00+08:00","value":0.99},{"datetime":"2020-07-05T08:00+08:00","value":0.98},{"datetime":"2020-07-05T09:00+08:00","value":0.07},{"datetime":"2020-07-05T10:00+08:00","value":0.24},{"datetime":"2020-07-05T11:00+08:00","value":0.46},{"datetime":"2020-07-05T12:00+08:00","value":0.59},{"datetime":"2020-07-05T13:00+08:00","value":0.68}],"skycon":[{"datetime":"2020-07-03T14:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-03T15:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-03T16:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-03T17:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-03T18:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-03T19:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-03T20:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-03T21:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-03T22:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-03T23:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-04T00:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-04T01:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-04T02:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-04T03:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-04T04:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-04T05:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-04T06:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-04T07:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-04T08:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-04T09:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-04T10:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-04T11:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-04T12:00+08:00","value":"PARTLY_CLOUDY_DAY"},{"datetime":"2020-07-04T13:00+08:00","value":"PARTLY_CLOUDY_DAY"},{"datetime":"2020-07-04T14:00+08:00","value":"PARTLY_CLOUDY_DAY"},{"datetime":"2020-07-04T15:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-07-04T16:00+08:00","value":"MODERATE_RAIN"},{"datetime":"2020-07-04T17:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-07-04T18:00+08:00","value":"PARTLY_CLOUDY_DAY"},{"datetime":"2020-07-04T19:00+08:00","value":"PARTLY_CLOUDY_NIGHT"},{"datetime":"2020-07-04T20:00+08:00","value":"PARTLY_CLOUDY_NIGHT"},{"datetime":"2020-07-04T21:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-04T22:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-04T23:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-05T00:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-05T01:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-05T02:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-05T03:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-05T04:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-05T05:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-05T06:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-05T07:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-05T08:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-05T09:00+08:00","value":"CLEAR_DAY"},{"datetime":"2020-07-05T10:00+08:00","value":"PARTLY_CLOUDY_DAY"},{"datetime":"2020-07-05T11:00+08:00","value":"PARTLY_CLOUDY_DAY"},{"datetime":"2020-07-05T12:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-07-05T13:00+08:00","value":"LIGHT_RAIN"}],"pressure":[{"datetime":"2020-07-03T14:00+08:00","value":99214.9624832001},{"datetime":"2020-07-03T15:00+08:00","value":99184.2899968001},{"datetime":"2020-07-03T16:00+08:00","value":99233.9539968001},{"datetime":"2020-07-03T17:00+08:00","value":99245.5544832001},{"datetime":"2020-07-03T18:00+08:00","value":99313.9539968001},{"datetime":"2020-07-03T19:00+08:00","value":99325.5544832001},{"datetime":"2020-07-03T20:00+08:00","value":99325.5544832001},{"datetime":"2020-07-03T21:00+08:00","value":99405.5544832001},{"datetime":"2020-07-03T22:00+08:00","value":99405.5544832001},{"datetime":"2020-07-03T23:00+08:00","value":99405.5544832001},{"datetime":"2020-07-04T00:00+08:00","value":99355.8904832001},{"datetime":"2020-07-04T01:00+08:00","value":99325.5544832001},{"datetime":"2020-07-04T02:00+08:00","value":99245.5544832001},{"datetime":"2020-07-04T03:00+08:00","value":99245.5544832},{"datetime":"2020-07-04T04:00+08:00","value":99275.8904832001},{"datetime":"2020-07-04T05:00+08:00","value":99325.5544832001},{"datetime":"2020-07-04T06:00+08:00","value":99325.5544832001},{"datetime":"2020-07-04T07:00+08:00","value":99325.5544832001},{"datetime":"2020-07-04T08:00+08:00","value":99325.5544832001},{"datetime":"2020-07-04T09:00+08:00","value":99386.5629696001},{"datetime":"2020-07-04T10:00+08:00","value":99405.5544832001},{"datetime":"2020-07-04T11:00+08:00","value":99356.2269696001},{"datetime":"2020-07-04T12:00+08:00","value":99313.9539968001},{"datetime":"2020-07-04T13:00+08:00","value":99215.2184832001},{"datetime":"2020-07-04T14:00+08:00","value":99104.6264832001},{"datetime":"2020-07-04T15:00+08:00","value":99073.9539968001},{"datetime":"2020-07-04T16:00+08:00","value":99005.5544832001},{"datetime":"2020-07-04T17:00+08:00","value":99073.9539968001},{"datetime":"2020-07-04T18:00+08:00","value":99104.2899968001},{"datetime":"2020-07-04T19:00+08:00","value":99104.2899968},{"datetime":"2020-07-04T20:00+08:00","value":99134.8819968001},{"datetime":"2020-07-04T21:00+08:00","value":99134.8819968001},{"datetime":"2020-07-04T22:00+08:00","value":99165.5544832},{"datetime":"2020-07-04T23:00+08:00","value":99165.5544832001},{"datetime":"2020-07-05T00:00+08:00","value":99165.5544832001},{"datetime":"2020-07-05T01:00+08:00","value":99085.5544832001},{"datetime":"2020-07-05T02:00+08:00","value":99005.5544832001},{"datetime":"2020-07-05T03:00+08:00","value":99005.5544832001},{"datetime":"2020-07-05T04:00+08:00","value":99005.5544832},{"datetime":"2020-07-05T05:00+08:00","value":99005.5544832001},{"datetime":"2020-07-05T06:00+08:00","value":99066.5629696001},{"datetime":"2020-07-05T07:00+08:00","value":99085.5544832001},{"datetime":"2020-07-05T08:00+08:00","value":99085.5544832001},{"datetime":"2020-07-05T09:00+08:00","value":99085.5544832001},{"datetime":"2020-07-05T10:00+08:00","value":99066.5629696001},{"datetime":"2020-07-05T11:00+08:00","value":99005.5544832001},{"datetime":"2020-07-05T12:00+08:00","value":98993.9539968001},{"datetime":"2020-07-05T13:00+08:00","value":98956.2269696001}],"visibility":[{"datetime":"2020-07-03T14:00+08:00","value":16},{"datetime":"2020-07-03T15:00+08:00","value":15.26},{"datetime":"2020-07-03T16:00+08:00","value":12.22},{"datetime":"2020-07-03T17:00+08:00","value":10.15},{"datetime":"2020-07-03T18:00+08:00","value":8.66},{"datetime":"2020-07-03T19:00+08:00","value":7.54},{"datetime":"2020-07-03T20:00+08:00","value":7.35},{"datetime":"2020-07-03T21:00+08:00","value":7.3},{"datetime":"2020-07-03T22:00+08:00","value":7.21},{"datetime":"2020-07-03T23:00+08:00","value":7.09},{"datetime":"2020-07-04T00:00+08:00","value":7.04},{"datetime":"2020-07-04T01:00+08:00","value":6.64},{"datetime":"2020-07-04T02:00+08:00","value":6.9},{"datetime":"2020-07-04T03:00+08:00","value":6.68},{"datetime":"2020-07-04T04:00+08:00","value":6.75},{"datetime":"2020-07-04T05:00+08:00","value":6.93},{"datetime":"2020-07-04T06:00+08:00","value":7.09},{"datetime":"2020-07-04T07:00+08:00","value":7.72},{"datetime":"2020-07-04T08:00+08:00","value":8.54},{"datetime":"2020-07-04T09:00+08:00","value":11.63},{"datetime":"2020-07-04T10:00+08:00","value":14.54},{"datetime":"2020-07-04T11:00+08:00","value":16},{"datetime":"2020-07-04T12:00+08:00","value":16},{"datetime":"2020-07-04T13:00+08:00","value":16},{"datetime":"2020-07-04T14:00+08:00","value":16},{"datetime":"2020-07-04T15:00+08:00","value":16},{"datetime":"2020-07-04T16:00+08:00","value":15.5},{"datetime":"2020-07-04T17:00+08:00","value":11.78},{"datetime":"2020-07-04T18:00+08:00","value":8.94},{"datetime":"2020-07-04T19:00+08:00","value":7.89},{"datetime":"2020-07-04T20:00+08:00","value":7.5},{"datetime":"2020-07-04T21:00+08:00","value":7.2},{"datetime":"2020-07-04T22:00+08:00","value":7.28},{"datetime":"2020-07-04T23:00+08:00","value":7.68},{"datetime":"2020-07-05T00:00+08:00","value":7.59},{"datetime":"2020-07-05T01:00+08:00","value":7.33},{"datetime":"2020-07-05T02:00+08:00","value":7.11},{"datetime":"2020-07-05T03:00+08:00","value":7.13},{"datetime":"2020-07-05T04:00+08:00","value":6.9},{"datetime":"2020-07-05T05:00+08:00","value":6.97},{"datetime":"2020-07-05T06:00+08:00","value":7.28},{"datetime":"2020-07-05T07:00+08:00","value":8.83},{"datetime":"2020-07-05T08:00+08:00","value":11.1},{"datetime":"2020-07-05T09:00+08:00","value":15.34},{"datetime":"2020-07-05T10:00+08:00","value":16},{"datetime":"2020-07-05T11:00+08:00","value":16},{"datetime":"2020-07-05T12:00+08:00","value":16},{"datetime":"2020-07-05T13:00+08:00","value":16}],"dswrf":[{"datetime":"2020-07-03T14:00+08:00","value":763.83973376},{"datetime":"2020-07-03T15:00+08:00","value":644.1420544},{"datetime":"2020-07-03T16:00+08:00","value":566.8689664},{"datetime":"2020-07-03T17:00+08:00","value":480.3693312},{"datetime":"2020-07-03T18:00+08:00","value":389.9195136},{"datetime":"2020-07-03T19:00+08:00","value":314.2276352},{"datetime":"2020-07-03T20:00+08:00","value":263.17904128},{"datetime":"2020-07-03T21:00+08:00","value":0},{"datetime":"2020-07-03T22:00+08:00","value":0},{"datetime":"2020-07-03T23:00+08:00","value":0},{"datetime":"2020-07-04T00:00+08:00","value":0},{"datetime":"2020-07-04T01:00+08:00","value":0},{"datetime":"2020-07-04T02:00+08:00","value":0},{"datetime":"2020-07-04T03:00+08:00","value":0},{"datetime":"2020-07-04T04:00+08:00","value":0},{"datetime":"2020-07-04T05:00+08:00","value":0},{"datetime":"2020-07-04T06:00+08:00","value":10},{"datetime":"2020-07-04T07:00+08:00","value":40},{"datetime":"2020-07-04T08:00+08:00","value":84.31620608},{"datetime":"2020-07-04T09:00+08:00","value":473.099392},{"datetime":"2020-07-04T10:00+08:00","value":566.125696},{"datetime":"2020-07-04T11:00+08:00","value":664.10681088},{"datetime":"2020-07-04T12:00+08:00","value":739.26613248},{"datetime":"2020-07-04T13:00+08:00","value":783.66202368},{"datetime":"2020-07-04T14:00+08:00","value":803.0214784},{"datetime":"2020-07-04T15:00+08:00","value":761.739392},{"datetime":"2020-07-04T16:00+08:00","value":677.915392},{"datetime":"2020-07-04T17:00+08:00","value":567.0975744},{"datetime":"2020-07-04T18:00+08:00","value":452.4036352},{"datetime":"2020-07-04T19:00+08:00","value":367.645696},{"datetime":"2020-07-04T20:00+08:00","value":306.50096896},{"datetime":"2020-07-04T21:00+08:00","value":0},{"datetime":"2020-07-04T22:00+08:00","value":0},{"datetime":"2020-07-04T23:00+08:00","value":0},{"datetime":"2020-07-05T00:00+08:00","value":0},{"datetime":"2020-07-05T01:00+08:00","value":0},{"datetime":"2020-07-05T02:00+08:00","value":0},{"datetime":"2020-07-05T03:00+08:00","value":0},{"datetime":"2020-07-05T04:00+08:00","value":0},{"datetime":"2020-07-05T05:00+08:00","value":0},{"datetime":"2020-07-05T06:00+08:00","value":10},{"datetime":"2020-07-05T07:00+08:00","value":40},{"datetime":"2020-07-05T08:00+08:00","value":96.79986688},{"datetime":"2020-07-05T09:00+08:00","value":632.3419392},{"datetime":"2020-07-05T10:00+08:00","value":709.0761216},{"datetime":"2020-07-05T11:00+08:00","value":749.00631552},{"datetime":"2020-07-05T12:00+08:00","value":766.63351552},{"datetime":"2020-07-05T13:00+08:00","value":760.24050944}],"air_quality":{"aqi":[{"datetime":"2020-07-03T14:00+08:00","value":{"chn":8,"usa":8}},{"datetime":"2020-07-03T15:00+08:00","value":{"chn":8,"usa":8}},{"datetime":"2020-07-03T16:00+08:00","value":{"chn":7,"usa":7}},{"datetime":"2020-07-03T17:00+08:00","value":{"chn":7,"usa":7}},{"datetime":"2020-07-03T18:00+08:00","value":{"chn":7,"usa":7}},{"datetime":"2020-07-03T19:00+08:00","value":{"chn":8,"usa":8}},{"datetime":"2020-07-03T20:00+08:00","value":{"chn":8,"usa":8}},{"datetime":"2020-07-03T21:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-07-03T22:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-07-03T23:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-07-04T00:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-07-04T01:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-07-04T02:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-07-04T03:00+08:00","value":{"chn":11,"usa":11}},{"datetime":"2020-07-04T04:00+08:00","value":{"chn":11,"usa":11}},{"datetime":"2020-07-04T05:00+08:00","value":{"chn":11,"usa":11}},{"datetime":"2020-07-04T06:00+08:00","value":{"chn":11,"usa":11}},{"datetime":"2020-07-04T07:00+08:00","value":{"chn":11,"usa":11}},{"datetime":"2020-07-04T08:00+08:00","value":{"chn":11,"usa":11}},{"datetime":"2020-07-04T09:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-07-04T10:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-07-04T11:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-07-04T12:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-07-04T13:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-07-04T14:00+08:00","value":{"chn":8,"usa":8}},{"datetime":"2020-07-04T15:00+08:00","value":{"chn":8,"usa":8}},{"datetime":"2020-07-04T16:00+08:00","value":{"chn":7,"usa":7}},{"datetime":"2020-07-04T17:00+08:00","value":{"chn":7,"usa":7}},{"datetime":"2020-07-04T18:00+08:00","value":{"chn":8,"usa":8}},{"datetime":"2020-07-04T19:00+08:00","value":{"chn":8,"usa":8}},{"datetime":"2020-07-04T20:00+08:00","value":{"chn":8,"usa":8}},{"datetime":"2020-07-04T21:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-07-04T22:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-07-04T23:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-07-05T00:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-07-05T01:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-07-05T02:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-07-05T03:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-07-05T04:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-07-05T05:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-07-05T06:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-07-05T07:00+08:00","value":{"chn":8,"usa":8}},{"datetime":"2020-07-05T08:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-07-05T09:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-07-05T10:00+08:00","value":{"chn":8,"usa":8}},{"datetime":"2020-07-05T11:00+08:00","value":{"chn":8,"usa":8}},{"datetime":"2020-07-05T12:00+08:00","value":{"chn":8,"usa":8}},{"datetime":"2020-07-05T13:00+08:00","value":{"chn":7,"usa":7}}],"pm25":[{"datetime":"2020-07-03T14:00+08:00","value":3},{"datetime":"2020-07-03T15:00+08:00","value":4},{"datetime":"2020-07-03T16:00+08:00","value":4},{"datetime":"2020-07-03T17:00+08:00","value":4},{"datetime":"2020-07-03T18:00+08:00","value":5},{"datetime":"2020-07-03T19:00+08:00","value":5},{"datetime":"2020-07-03T20:00+08:00","value":6},{"datetime":"2020-07-03T21:00+08:00","value":7},{"datetime":"2020-07-03T22:00+08:00","value":7},{"datetime":"2020-07-03T23:00+08:00","value":7},{"datetime":"2020-07-04T00:00+08:00","value":8},{"datetime":"2020-07-04T01:00+08:00","value":8},{"datetime":"2020-07-04T02:00+08:00","value":8},{"datetime":"2020-07-04T03:00+08:00","value":7},{"datetime":"2020-07-04T04:00+08:00","value":7},{"datetime":"2020-07-04T05:00+08:00","value":7},{"datetime":"2020-07-04T06:00+08:00","value":7},{"datetime":"2020-07-04T07:00+08:00","value":8},{"datetime":"2020-07-04T08:00+08:00","value":8},{"datetime":"2020-07-04T09:00+08:00","value":9},{"datetime":"2020-07-04T10:00+08:00","value":8},{"datetime":"2020-07-04T11:00+08:00","value":7},{"datetime":"2020-07-04T12:00+08:00","value":6},{"datetime":"2020-07-04T13:00+08:00","value":6},{"datetime":"2020-07-04T14:00+08:00","value":6},{"datetime":"2020-07-04T15:00+08:00","value":5},{"datetime":"2020-07-04T16:00+08:00","value":5},{"datetime":"2020-07-04T17:00+08:00","value":5},{"datetime":"2020-07-04T18:00+08:00","value":5},{"datetime":"2020-07-04T19:00+08:00","value":5},{"datetime":"2020-07-04T20:00+08:00","value":6},{"datetime":"2020-07-04T21:00+08:00","value":7},{"datetime":"2020-07-04T22:00+08:00","value":7},{"datetime":"2020-07-04T23:00+08:00","value":7},{"datetime":"2020-07-05T00:00+08:00","value":7},{"datetime":"2020-07-05T01:00+08:00","value":8},{"datetime":"2020-07-05T02:00+08:00","value":8},{"datetime":"2020-07-05T03:00+08:00","value":8},{"datetime":"2020-07-05T04:00+08:00","value":7},{"datetime":"2020-07-05T05:00+08:00","value":7},{"datetime":"2020-07-05T06:00+08:00","value":6},{"datetime":"2020-07-05T07:00+08:00","value":6},{"datetime":"2020-07-05T08:00+08:00","value":6},{"datetime":"2020-07-05T09:00+08:00","value":6},{"datetime":"2020-07-05T10:00+08:00","value":6},{"datetime":"2020-07-05T11:00+08:00","value":6},{"datetime":"2020-07-05T12:00+08:00","value":6},{"datetime":"2020-07-05T13:00+08:00","value":5}]}}
         * daily : {"status":"ok","astro":[{"date":"2020-07-03T00:00+08:00","sunrise":{"time":"05:07"},"sunset":{"time":"18:47"}},{"date":"2020-07-04T00:00+08:00","sunrise":{"time":"05:08"},"sunset":{"time":"18:47"}},{"date":"2020-07-05T00:00+08:00","sunrise":{"time":"05:08"},"sunset":{"time":"18:47"}},{"date":"2020-07-06T00:00+08:00","sunrise":{"time":"05:08"},"sunset":{"time":"18:47"}},{"date":"2020-07-07T00:00+08:00","sunrise":{"time":"05:09"},"sunset":{"time":"18:47"}}],"precipitation":[{"date":"2020-07-03T00:00+08:00","max":0.057,"min":0,"avg":0.0057},{"date":"2020-07-04T00:00+08:00","max":1.4291,"min":0,"avg":0.0965},{"date":"2020-07-05T00:00+08:00","max":0.8518,"min":0,"avg":0.0496},{"date":"2020-07-06T00:00+08:00","max":0.3131,"min":0,"avg":0.0564},{"date":"2020-07-07T00:00+08:00","max":1.0025,"min":0,"avg":0.1742}],"temperature":[{"date":"2020-07-03T00:00+08:00","max":32.16,"min":26,"avg":28.29},{"date":"2020-07-04T00:00+08:00","max":31,"min":26,"avg":28.93},{"date":"2020-07-05T00:00+08:00","max":31,"min":26,"avg":28.47},{"date":"2020-07-06T00:00+08:00","max":31,"min":26,"avg":28.55},{"date":"2020-07-07T00:00+08:00","max":31,"min":26,"avg":28.54}],"wind":[{"date":"2020-07-03T00:00+08:00","max":{"speed":30.96,"direction":220},"min":{"speed":0.36,"direction":282.01},"avg":{"speed":4.97,"direction":223.75}},{"date":"2020-07-04T00:00+08:00","max":{"speed":9.03,"direction":212.93},"min":{"speed":0.8,"direction":9.78},"avg":{"speed":3.58,"direction":223.6}},{"date":"2020-07-05T00:00+08:00","max":{"speed":7.44,"direction":279.72},"min":{"speed":0.51,"direction":152.85},"avg":{"speed":3.3,"direction":229.92}},{"date":"2020-07-06T00:00+08:00","max":{"speed":6.77,"direction":273.26},"min":{"speed":0.72,"direction":225.05},"avg":{"speed":3.51,"direction":240.28}},{"date":"2020-07-07T00:00+08:00","max":{"speed":7.53,"direction":263.89},"min":{"speed":0.62,"direction":122.5},"avg":{"speed":4.64,"direction":241.72}}],"humidity":[{"date":"2020-07-03T00:00+08:00","max":0.83,"min":0.67,"avg":0.78},{"date":"2020-07-04T00:00+08:00","max":0.84,"min":0.66,"avg":0.77},{"date":"2020-07-05T00:00+08:00","max":0.83,"min":0.66,"avg":0.76},{"date":"2020-07-06T00:00+08:00","max":0.83,"min":0.67,"avg":0.77},{"date":"2020-07-07T00:00+08:00","max":0.84,"min":0.67,"avg":0.76}],"cloudrate":[{"date":"2020-07-03T00:00+08:00","max":1,"min":0.85,"avg":0.97},{"date":"2020-07-04T00:00+08:00","max":1,"min":0.28,"avg":0.85},{"date":"2020-07-05T00:00+08:00","max":1,"min":0.07,"avg":0.84},{"date":"2020-07-06T00:00+08:00","max":1,"min":0.95,"avg":0.99},{"date":"2020-07-07T00:00+08:00","max":1,"min":0.82,"avg":0.98}],"pressure":[{"date":"2020-07-03T00:00+08:00","max":99405.55,"min":99165.55,"avg":99306.05},{"date":"2020-07-04T00:00+08:00","max":99405.55,"min":99005.55,"avg":99228.99},{"date":"2020-07-05T00:00+08:00","max":99165.55,"min":98814.96,"avg":98988.2},{"date":"2020-07-06T00:00+08:00","max":99245.55,"min":98864.29,"avg":99028.96},{"date":"2020-07-07T00:00+08:00","max":99405.55,"min":99115.89,"avg":99257.06}],"visibility":[{"date":"2020-07-03T00:00+08:00","max":24.13,"min":7.09,"avg":9.88},{"date":"2020-07-04T00:00+08:00","max":16,"min":6.64,"avg":10.18},{"date":"2020-07-05T00:00+08:00","max":16,"min":6.9,"avg":11.02},{"date":"2020-07-06T00:00+08:00","max":16,"min":6.92,"avg":10.49},{"date":"2020-07-07T00:00+08:00","max":16,"min":6.79,"avg":10.61}],"dswrf":[{"date":"2020-07-03T00:00+08:00","max":763.8,"min":0,"avg":342.3},{"date":"2020-07-04T00:00+08:00","max":803,"min":0,"avg":304},{"date":"2020-07-05T00:00+08:00","max":766.6,"min":0,"avg":311.5},{"date":"2020-07-06T00:00+08:00","max":786.2,"min":0,"avg":294.1},{"date":"2020-07-07T00:00+08:00","max":760.9,"min":0,"avg":278.5}],"air_quality":{"aqi":[{"date":"2020-07-03T00:00+08:00","max":{"chn":11,"usa":11},"avg":{"chn":8,"usa":8},"min":{"chn":7,"usa":7}},{"date":"2020-07-04T00:00+08:00","max":{"chn":11,"usa":11},"avg":{"chn":9.42,"usa":9.42},"min":{"chn":7,"usa":7}},{"date":"2020-07-05T00:00+08:00","max":{"chn":10,"usa":10},"avg":{"chn":8.29,"usa":8.29},"min":{"chn":7,"usa":7}},{"date":"2020-07-06T00:00+08:00","max":{"chn":10,"usa":10},"avg":{"chn":8.12,"usa":8.12},"min":{"chn":7,"usa":7}},{"date":"2020-07-07T00:00+08:00","max":{"chn":8,"usa":8},"avg":{"chn":7.62,"usa":7.62},"min":{"chn":7,"usa":7}}],"pm25":[{"date":"2020-07-03T00:00+08:00","max":7,"avg":5.2,"min":3},{"date":"2020-07-04T00:00+08:00","max":9,"avg":6.75,"min":5},{"date":"2020-07-05T00:00+08:00","max":8,"avg":5.88,"min":3},{"date":"2020-07-06T00:00+08:00","max":8,"avg":5.33,"min":3},{"date":"2020-07-07T00:00+08:00","max":5,"avg":4.08,"min":3}]},"skycon":[{"date":"2020-07-03T00:00+08:00","value":"CLOUDY"},{"date":"2020-07-04T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-07-05T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-07-06T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-07-07T00:00+08:00","value":"LIGHT_RAIN"}],"skycon_08h_20h":[{"date":"2020-07-03T00:00+08:00","value":"CLOUDY"},{"date":"2020-07-04T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-07-05T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-07-06T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-07-07T00:00+08:00","value":"LIGHT_RAIN"}],"skycon_20h_32h":[{"date":"2020-07-03T00:00+08:00","value":"CLOUDY"},{"date":"2020-07-04T00:00+08:00","value":"CLOUDY"},{"date":"2020-07-05T00:00+08:00","value":"CLOUDY"},{"date":"2020-07-06T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-07-07T00:00+08:00","value":"LIGHT_RAIN"}],"life_index":{"ultraviolet":[{"date":"2020-07-03T00:00+08:00","index":"1","desc":"最弱"},{"date":"2020-07-04T00:00+08:00","index":"1","desc":"最弱"},{"date":"2020-07-05T00:00+08:00","index":"3","desc":"中等"},{"date":"2020-07-06T00:00+08:00","index":"1","desc":"最弱"},{"date":"2020-07-07T00:00+08:00","index":"1","desc":"最弱"}],"carWashing":[{"date":"2020-07-03T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-07-04T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-07-05T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-07-06T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-07-07T00:00+08:00","index":"3","desc":"较不适宜"}],"dressing":[{"date":"2020-07-03T00:00+08:00","index":"2","desc":"很热"},{"date":"2020-07-04T00:00+08:00","index":"2","desc":"很热"},{"date":"2020-07-05T00:00+08:00","index":"2","desc":"很热"},{"date":"2020-07-06T00:00+08:00","index":"2","desc":"很热"},{"date":"2020-07-07T00:00+08:00","index":"2","desc":"很热"}],"comfort":[{"date":"2020-07-03T00:00+08:00","index":"0","desc":"闷热"},{"date":"2020-07-04T00:00+08:00","index":"0","desc":"闷热"},{"date":"2020-07-05T00:00+08:00","index":"0","desc":"闷热"},{"date":"2020-07-06T00:00+08:00","index":"0","desc":"闷热"},{"date":"2020-07-07T00:00+08:00","index":"0","desc":"闷热"}],"coldRisk":[{"date":"2020-07-03T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-07-04T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-07-05T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-07-06T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-07-07T00:00+08:00","index":"3","desc":"易发"}]}}
         * primary : 0
         * forecast_keypoint : 您北边16公里正下着暴雨呢
         */

        private RealtimeBean realtime;
        private MinutelyBean minutely;
        private HourlyBean hourly;
        private DailyBean daily;
        private int primary;
        private String forecast_keypoint;

        public RealtimeBean getRealtime() {
            return realtime;
        }

        public void setRealtime(RealtimeBean realtime) {
            this.realtime = realtime;
        }

        public MinutelyBean getMinutely() {
            return minutely;
        }

        public void setMinutely(MinutelyBean minutely) {
            this.minutely = minutely;
        }

        public HourlyBean getHourly() {
            return hourly;
        }

        public void setHourly(HourlyBean hourly) {
            this.hourly = hourly;
        }

        public DailyBean getDaily() {
            return daily;
        }

        public void setDaily(DailyBean daily) {
            this.daily = daily;
        }

        public int getPrimary() {
            return primary;
        }

        public void setPrimary(int primary) {
            this.primary = primary;
        }

        public String getForecast_keypoint() {
            return forecast_keypoint;
        }

        public void setForecast_keypoint(String forecast_keypoint) {
            this.forecast_keypoint = forecast_keypoint;
        }

        public static class RealtimeBean {
            /**
             * status : ok
             * temperature : 32.16
             * humidity : 0.7
             * cloudrate : 0.9
             * skycon : CLOUDY
             * visibility : 16.0
             * dswrf : 763.8
             * wind : {"speed":30.96,"direction":220}
             * pressure : 99214.96
             * apparent_temperature : 31.8
             * precipitation : {"local":{"status":"ok","datasource":"radar","intensity":0},"nearest":{"status":"ok","distance":16,"intensity":2}}
             * air_quality : {"pm25":3,"pm10":0,"o3":0,"so2":0,"no2":0,"co":0,"aqi":{"chn":8,"usa":0},"description":{"usa":"","chn":"优"}}
             * life_index : {"ultraviolet":{"index":1,"desc":"很弱"},"comfort":{"index":0,"desc":"闷热"}}
             */

            private String status;
            private double temperature;
            private double humidity;
            private double cloudrate;
            private String skycon;
            private double visibility;
            private double dswrf;
            private WindBean wind;
            private double pressure;
            private double apparent_temperature;
            private PrecipitationBean precipitation;
            private AirQualityBean air_quality;
            private LifeIndexBean life_index;

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public double getTemperature() {
                return temperature;
            }

            public void setTemperature(double temperature) {
                this.temperature = temperature;
            }

            public double getHumidity() {
                return humidity;
            }

            public void setHumidity(double humidity) {
                this.humidity = humidity;
            }

            public double getCloudrate() {
                return cloudrate;
            }

            public void setCloudrate(double cloudrate) {
                this.cloudrate = cloudrate;
            }

            public String getSkycon() {
                return skycon;
            }

            public void setSkycon(String skycon) {
                this.skycon = skycon;
            }

            public double getVisibility() {
                return visibility;
            }

            public void setVisibility(double visibility) {
                this.visibility = visibility;
            }

            public double getDswrf() {
                return dswrf;
            }

            public void setDswrf(double dswrf) {
                this.dswrf = dswrf;
            }

            public WindBean getWind() {
                return wind;
            }

            public void setWind(WindBean wind) {
                this.wind = wind;
            }

            public double getPressure() {
                return pressure;
            }

            public void setPressure(double pressure) {
                this.pressure = pressure;
            }

            public double getApparent_temperature() {
                return apparent_temperature;
            }

            public void setApparent_temperature(double apparent_temperature) {
                this.apparent_temperature = apparent_temperature;
            }

            public PrecipitationBean getPrecipitation() {
                return precipitation;
            }

            public void setPrecipitation(PrecipitationBean precipitation) {
                this.precipitation = precipitation;
            }

            public AirQualityBean getAir_quality() {
                return air_quality;
            }

            public void setAir_quality(AirQualityBean air_quality) {
                this.air_quality = air_quality;
            }

            public LifeIndexBean getLife_index() {
                return life_index;
            }

            public void setLife_index(LifeIndexBean life_index) {
                this.life_index = life_index;
            }

            public static class WindBean {
                /**
                 * speed : 30.96
                 * direction : 220.0
                 */

                private double speed;
                private double direction;

                public double getSpeed() {
                    return speed;
                }

                public void setSpeed(double speed) {
                    this.speed = speed;
                }

                public double getDirection() {
                    return direction;
                }

                public void setDirection(double direction) {
                    this.direction = direction;
                }
            }

            public static class PrecipitationBean {
                /**
                 * local : {"status":"ok","datasource":"radar","intensity":0}
                 * nearest : {"status":"ok","distance":16,"intensity":2}
                 */

                private LocalBean local;
                private NearestBean nearest;

                public LocalBean getLocal() {
                    return local;
                }

                public void setLocal(LocalBean local) {
                    this.local = local;
                }

                public NearestBean getNearest() {
                    return nearest;
                }

                public void setNearest(NearestBean nearest) {
                    this.nearest = nearest;
                }

                public static class LocalBean {
                    /**
                     * status : ok
                     * datasource : radar
                     * intensity : 0.0
                     */

                    private String status;
                    private String datasource;
                    private double intensity;

                    public String getStatus() {
                        return status;
                    }

                    public void setStatus(String status) {
                        this.status = status;
                    }

                    public String getDatasource() {
                        return datasource;
                    }

                    public void setDatasource(String datasource) {
                        this.datasource = datasource;
                    }

                    public double getIntensity() {
                        return intensity;
                    }

                    public void setIntensity(double intensity) {
                        this.intensity = intensity;
                    }
                }

                public static class NearestBean {
                    /**
                     * status : ok
                     * distance : 16.0
                     * intensity : 2.0
                     */

                    private String status;
                    private double distance;
                    private double intensity;

                    public String getStatus() {
                        return status;
                    }

                    public void setStatus(String status) {
                        this.status = status;
                    }

                    public double getDistance() {
                        return distance;
                    }

                    public void setDistance(double distance) {
                        this.distance = distance;
                    }

                    public double getIntensity() {
                        return intensity;
                    }

                    public void setIntensity(double intensity) {
                        this.intensity = intensity;
                    }
                }
            }

            public static class AirQualityBean {
                /**
                 * pm25 : 3
                 * pm10 : 0
                 * o3 : 0
                 * so2 : 0
                 * no2 : 0
                 * co : 0
                 * aqi : {"chn":8,"usa":0}
                 * description : {"usa":"","chn":"优"}
                 */

                private int pm25;
                private int pm10;
                private int o3;
                private int so2;
                private int no2;
                private int co;
                private AqiBean aqi;
                private DescriptionBean description;

                public int getPm25() {
                    return pm25;
                }

                public void setPm25(int pm25) {
                    this.pm25 = pm25;
                }

                public int getPm10() {
                    return pm10;
                }

                public void setPm10(int pm10) {
                    this.pm10 = pm10;
                }

                public int getO3() {
                    return o3;
                }

                public void setO3(int o3) {
                    this.o3 = o3;
                }

                public int getSo2() {
                    return so2;
                }

                public void setSo2(int so2) {
                    this.so2 = so2;
                }

                public int getNo2() {
                    return no2;
                }

                public void setNo2(int no2) {
                    this.no2 = no2;
                }

                public int getCo() {
                    return co;
                }

                public void setCo(int co) {
                    this.co = co;
                }

                public AqiBean getAqi() {
                    return aqi;
                }

                public void setAqi(AqiBean aqi) {
                    this.aqi = aqi;
                }

                public DescriptionBean getDescription() {
                    return description;
                }

                public void setDescription(DescriptionBean description) {
                    this.description = description;
                }

                public static class AqiBean {
                    /**
                     * chn : 8
                     * usa : 0
                     */

                    private int chn;
                    private int usa;

                    public int getChn() {
                        return chn;
                    }

                    public void setChn(int chn) {
                        this.chn = chn;
                    }

                    public int getUsa() {
                        return usa;
                    }

                    public void setUsa(int usa) {
                        this.usa = usa;
                    }
                }

                public static class DescriptionBean {
                    /**
                     * usa :
                     * chn : 优
                     */

                    private String usa;
                    private String chn;

                    public String getUsa() {
                        return usa;
                    }

                    public void setUsa(String usa) {
                        this.usa = usa;
                    }

                    public String getChn() {
                        return chn;
                    }

                    public void setChn(String chn) {
                        this.chn = chn;
                    }
                }
            }

            public static class LifeIndexBean {
                /**
                 * ultraviolet : {"index":1,"desc":"很弱"}
                 * comfort : {"index":0,"desc":"闷热"}
                 */

                private UltravioletBean ultraviolet;
                private ComfortBean comfort;

                public UltravioletBean getUltraviolet() {
                    return ultraviolet;
                }

                public void setUltraviolet(UltravioletBean ultraviolet) {
                    this.ultraviolet = ultraviolet;
                }

                public ComfortBean getComfort() {
                    return comfort;
                }

                public void setComfort(ComfortBean comfort) {
                    this.comfort = comfort;
                }

                public static class UltravioletBean {
                    /**
                     * index : 1.0
                     * desc : 很弱
                     */

                    private double index;
                    private String desc;

                    public double getIndex() {
                        return index;
                    }

                    public void setIndex(double index) {
                        this.index = index;
                    }

                    public String getDesc() {
                        return desc;
                    }

                    public void setDesc(String desc) {
                        this.desc = desc;
                    }
                }

                public static class ComfortBean {
                    /**
                     * index : 0
                     * desc : 闷热
                     */

                    private int index;
                    private String desc;

                    public int getIndex() {
                        return index;
                    }

                    public void setIndex(int index) {
                        this.index = index;
                    }

                    public String getDesc() {
                        return desc;
                    }

                    public void setDesc(String desc) {
                        this.desc = desc;
                    }
                }
            }
        }

        public static class MinutelyBean {
            /**
             * status : ok
             * datasource : radar
             * precipitation_2h : [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
             * precipitation : [0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0]
             * probability : [0,0,0,0]
             * description : 您北边16公里正下着暴雨呢
             */

            private String status;
            private String datasource;
            private String description;
            private List<Double> precipitation_2h;
            private List<Double> precipitation;
            private List<Double> probability;

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getDatasource() {
                return datasource;
            }

            public void setDatasource(String datasource) {
                this.datasource = datasource;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public List<Double> getPrecipitation_2h() {
                return precipitation_2h;
            }

            public void setPrecipitation_2h(List<Double> precipitation_2h) {
                this.precipitation_2h = precipitation_2h;
            }

            public List<Double> getPrecipitation() {
                return precipitation;
            }

            public void setPrecipitation(List<Double> precipitation) {
                this.precipitation = precipitation;
            }

            public List<Double> getProbability() {
                return probability;
            }

            public void setProbability(List<Double> probability) {
                this.probability = probability;
            }
        }

        public static class HourlyBean {
            /**
             * status : ok
             * description : 阴，明天中午13点钟后转多云，其后云渐少
             * precipitation : [{"datetime":"2020-07-03T14:00+08:00","value":0},{"datetime":"2020-07-03T15:00+08:00","value":0},{"datetime":"2020-07-03T16:00+08:00","value":0.057},{"datetime":"2020-07-03T17:00+08:00","value":0},{"datetime":"2020-07-03T18:00+08:00","value":0},{"datetime":"2020-07-03T19:00+08:00","value":0},{"datetime":"2020-07-03T20:00+08:00","value":0},{"datetime":"2020-07-03T21:00+08:00","value":0},{"datetime":"2020-07-03T22:00+08:00","value":0},{"datetime":"2020-07-03T23:00+08:00","value":0},{"datetime":"2020-07-04T00:00+08:00","value":0},{"datetime":"2020-07-04T01:00+08:00","value":0},{"datetime":"2020-07-04T02:00+08:00","value":0},{"datetime":"2020-07-04T03:00+08:00","value":0},{"datetime":"2020-07-04T04:00+08:00","value":0},{"datetime":"2020-07-04T05:00+08:00","value":0},{"datetime":"2020-07-04T06:00+08:00","value":0},{"datetime":"2020-07-04T07:00+08:00","value":0},{"datetime":"2020-07-04T08:00+08:00","value":0},{"datetime":"2020-07-04T09:00+08:00","value":0},{"datetime":"2020-07-04T10:00+08:00","value":0},{"datetime":"2020-07-04T11:00+08:00","value":0},{"datetime":"2020-07-04T12:00+08:00","value":0},{"datetime":"2020-07-04T13:00+08:00","value":0},{"datetime":"2020-07-04T14:00+08:00","value":0},{"datetime":"2020-07-04T15:00+08:00","value":0.5845},{"datetime":"2020-07-04T16:00+08:00","value":1.4291},{"datetime":"2020-07-04T17:00+08:00","value":0.3017},{"datetime":"2020-07-04T18:00+08:00","value":0},{"datetime":"2020-07-04T19:00+08:00","value":0},{"datetime":"2020-07-04T20:00+08:00","value":0},{"datetime":"2020-07-04T21:00+08:00","value":0},{"datetime":"2020-07-04T22:00+08:00","value":0},{"datetime":"2020-07-04T23:00+08:00","value":0},{"datetime":"2020-07-05T00:00+08:00","value":0},{"datetime":"2020-07-05T01:00+08:00","value":0},{"datetime":"2020-07-05T02:00+08:00","value":0},{"datetime":"2020-07-05T03:00+08:00","value":0},{"datetime":"2020-07-05T04:00+08:00","value":0},{"datetime":"2020-07-05T05:00+08:00","value":0},{"datetime":"2020-07-05T06:00+08:00","value":0},{"datetime":"2020-07-05T07:00+08:00","value":0},{"datetime":"2020-07-05T08:00+08:00","value":0},{"datetime":"2020-07-05T09:00+08:00","value":0},{"datetime":"2020-07-05T10:00+08:00","value":0},{"datetime":"2020-07-05T11:00+08:00","value":0},{"datetime":"2020-07-05T12:00+08:00","value":0.0653},{"datetime":"2020-07-05T13:00+08:00","value":0.8518}]
             * temperature : [{"datetime":"2020-07-03T14:00+08:00","value":32.16},{"datetime":"2020-07-03T15:00+08:00","value":30.8},{"datetime":"2020-07-03T16:00+08:00","value":30.14},{"datetime":"2020-07-03T17:00+08:00","value":28.68},{"datetime":"2020-07-03T18:00+08:00","value":28.12},{"datetime":"2020-07-03T19:00+08:00","value":27.56},{"datetime":"2020-07-03T20:00+08:00","value":26.5},{"datetime":"2020-07-03T21:00+08:00","value":26.4},{"datetime":"2020-07-03T22:00+08:00","value":26.3},{"datetime":"2020-07-03T23:00+08:00","value":26.2},{"datetime":"2020-07-04T00:00+08:00","value":26.1},{"datetime":"2020-07-04T01:00+08:00","value":26},{"datetime":"2020-07-04T02:00+08:00","value":26.5},{"datetime":"2020-07-04T03:00+08:00","value":27},{"datetime":"2020-07-04T04:00+08:00","value":27.5},{"datetime":"2020-07-04T05:00+08:00","value":28},{"datetime":"2020-07-04T06:00+08:00","value":28.5},{"datetime":"2020-07-04T07:00+08:00","value":29},{"datetime":"2020-07-04T08:00+08:00","value":29.5},{"datetime":"2020-07-04T09:00+08:00","value":30},{"datetime":"2020-07-04T10:00+08:00","value":30.5},{"datetime":"2020-07-04T11:00+08:00","value":31},{"datetime":"2020-07-04T12:00+08:00","value":31},{"datetime":"2020-07-04T13:00+08:00","value":30.8},{"datetime":"2020-07-04T14:00+08:00","value":31},{"datetime":"2020-07-04T15:00+08:00","value":30.9},{"datetime":"2020-07-04T16:00+08:00","value":30.74},{"datetime":"2020-07-04T17:00+08:00","value":30.28},{"datetime":"2020-07-04T18:00+08:00","value":29.77},{"datetime":"2020-07-04T19:00+08:00","value":29.2},{"datetime":"2020-07-04T20:00+08:00","value":28.44},{"datetime":"2020-07-04T21:00+08:00","value":27.86},{"datetime":"2020-07-04T22:00+08:00","value":27.5},{"datetime":"2020-07-04T23:00+08:00","value":27.23},{"datetime":"2020-07-05T00:00+08:00","value":26.88},{"datetime":"2020-07-05T01:00+08:00","value":26.54},{"datetime":"2020-07-05T02:00+08:00","value":26.75},{"datetime":"2020-07-05T03:00+08:00","value":27},{"datetime":"2020-07-05T04:00+08:00","value":27.29},{"datetime":"2020-07-05T05:00+08:00","value":26},{"datetime":"2020-07-05T06:00+08:00","value":28.01},{"datetime":"2020-07-05T07:00+08:00","value":28.25},{"datetime":"2020-07-05T08:00+08:00","value":28.39},{"datetime":"2020-07-05T09:00+08:00","value":28.39},{"datetime":"2020-07-05T10:00+08:00","value":28.51},{"datetime":"2020-07-05T11:00+08:00","value":31},{"datetime":"2020-07-05T12:00+08:00","value":29.45},{"datetime":"2020-07-05T13:00+08:00","value":30}]
             * wind : [{"datetime":"2020-07-03T14:00+08:00","speed":30.96,"direction":220},{"datetime":"2020-07-03T15:00+08:00","speed":5.84,"direction":325.62},{"datetime":"2020-07-03T16:00+08:00","speed":2.73,"direction":344.64},{"datetime":"2020-07-03T17:00+08:00","speed":2.36,"direction":2.37},{"datetime":"2020-07-03T18:00+08:00","speed":1.34,"direction":19.52},{"datetime":"2020-07-03T19:00+08:00","speed":0.36,"direction":282.01},{"datetime":"2020-07-03T20:00+08:00","speed":2,"direction":301.51},{"datetime":"2020-07-03T21:00+08:00","speed":2.98,"direction":291.2},{"datetime":"2020-07-03T22:00+08:00","speed":2.87,"direction":244.97},{"datetime":"2020-07-03T23:00+08:00","speed":4.59,"direction":181.87},{"datetime":"2020-07-04T00:00+08:00","speed":4.69,"direction":179.06},{"datetime":"2020-07-04T01:00+08:00","speed":3.48,"direction":234.46},{"datetime":"2020-07-04T02:00+08:00","speed":5.33,"direction":276.95},{"datetime":"2020-07-04T03:00+08:00","speed":6.65,"direction":261.95},{"datetime":"2020-07-04T04:00+08:00","speed":8.67,"direction":230.12},{"datetime":"2020-07-04T05:00+08:00","speed":9.03,"direction":212.93},{"datetime":"2020-07-04T06:00+08:00","speed":7.9,"direction":200.79},{"datetime":"2020-07-04T07:00+08:00","speed":6.5,"direction":204.72},{"datetime":"2020-07-04T08:00+08:00","speed":4.54,"direction":222.73},{"datetime":"2020-07-04T09:00+08:00","speed":2.23,"direction":292.57},{"datetime":"2020-07-04T10:00+08:00","speed":2.37,"direction":325.36},{"datetime":"2020-07-04T11:00+08:00","speed":1.55,"direction":313.83},{"datetime":"2020-07-04T12:00+08:00","speed":0.96,"direction":6.95},{"datetime":"2020-07-04T13:00+08:00","speed":0.8,"direction":9.78},{"datetime":"2020-07-04T14:00+08:00","speed":1.71,"direction":76.65},{"datetime":"2020-07-04T15:00+08:00","speed":2.1,"direction":77.64},{"datetime":"2020-07-04T16:00+08:00","speed":1.65,"direction":69.79},{"datetime":"2020-07-04T17:00+08:00","speed":2.14,"direction":109.39},{"datetime":"2020-07-04T18:00+08:00","speed":1.44,"direction":120.32},{"datetime":"2020-07-04T19:00+08:00","speed":1.51,"direction":149.7},{"datetime":"2020-07-04T20:00+08:00","speed":1.87,"direction":170.36},{"datetime":"2020-07-04T21:00+08:00","speed":2.52,"direction":161.83},{"datetime":"2020-07-04T22:00+08:00","speed":1.48,"direction":233.32},{"datetime":"2020-07-04T23:00+08:00","speed":4.89,"direction":284.63},{"datetime":"2020-07-05T00:00+08:00","speed":7.44,"direction":279.72},{"datetime":"2020-07-05T01:00+08:00","speed":7.35,"direction":269.74},{"datetime":"2020-07-05T02:00+08:00","speed":6.5,"direction":239.6},{"datetime":"2020-07-05T03:00+08:00","speed":5.28,"direction":225.94},{"datetime":"2020-07-05T04:00+08:00","speed":5.73,"direction":226.7},{"datetime":"2020-07-05T05:00+08:00","speed":5.92,"direction":225.79},{"datetime":"2020-07-05T06:00+08:00","speed":5.5,"direction":208.63},{"datetime":"2020-07-05T07:00+08:00","speed":6.27,"direction":188.37},{"datetime":"2020-07-05T08:00+08:00","speed":5.82,"direction":180.67},{"datetime":"2020-07-05T09:00+08:00","speed":2.6,"direction":179.93},{"datetime":"2020-07-05T10:00+08:00","speed":0.69,"direction":239.7},{"datetime":"2020-07-05T11:00+08:00","speed":1.54,"direction":300.28},{"datetime":"2020-07-05T12:00+08:00","speed":1.68,"direction":347.14},{"datetime":"2020-07-05T13:00+08:00","speed":1.11,"direction":16}]
             * humidity : [{"datetime":"2020-07-03T14:00+08:00","value":0.7},{"datetime":"2020-07-03T15:00+08:00","value":0.7},{"datetime":"2020-07-03T16:00+08:00","value":0.73},{"datetime":"2020-07-03T17:00+08:00","value":0.76},{"datetime":"2020-07-03T18:00+08:00","value":0.78},{"datetime":"2020-07-03T19:00+08:00","value":0.81},{"datetime":"2020-07-03T20:00+08:00","value":0.82},{"datetime":"2020-07-03T21:00+08:00","value":0.82},{"datetime":"2020-07-03T22:00+08:00","value":0.82},{"datetime":"2020-07-03T23:00+08:00","value":0.83},{"datetime":"2020-07-04T00:00+08:00","value":0.83},{"datetime":"2020-07-04T01:00+08:00","value":0.84},{"datetime":"2020-07-04T02:00+08:00","value":0.83},{"datetime":"2020-07-04T03:00+08:00","value":0.84},{"datetime":"2020-07-04T04:00+08:00","value":0.84},{"datetime":"2020-07-04T05:00+08:00","value":0.83},{"datetime":"2020-07-04T06:00+08:00","value":0.83},{"datetime":"2020-07-04T07:00+08:00","value":0.81},{"datetime":"2020-07-04T08:00+08:00","value":0.79},{"datetime":"2020-07-04T09:00+08:00","value":0.74},{"datetime":"2020-07-04T10:00+08:00","value":0.71},{"datetime":"2020-07-04T11:00+08:00","value":0.68},{"datetime":"2020-07-04T12:00+08:00","value":0.66},{"datetime":"2020-07-04T13:00+08:00","value":0.66},{"datetime":"2020-07-04T14:00+08:00","value":0.7},{"datetime":"2020-07-04T15:00+08:00","value":0.69},{"datetime":"2020-07-04T16:00+08:00","value":0.7},{"datetime":"2020-07-04T17:00+08:00","value":0.74},{"datetime":"2020-07-04T18:00+08:00","value":0.78},{"datetime":"2020-07-04T19:00+08:00","value":0.8},{"datetime":"2020-07-04T20:00+08:00","value":0.81},{"datetime":"2020-07-04T21:00+08:00","value":0.82},{"datetime":"2020-07-04T22:00+08:00","value":0.82},{"datetime":"2020-07-04T23:00+08:00","value":0.81},{"datetime":"2020-07-05T00:00+08:00","value":0.81},{"datetime":"2020-07-05T01:00+08:00","value":0.82},{"datetime":"2020-07-05T02:00+08:00","value":0.83},{"datetime":"2020-07-05T03:00+08:00","value":0.82},{"datetime":"2020-07-05T04:00+08:00","value":0.83},{"datetime":"2020-07-05T05:00+08:00","value":0.83},{"datetime":"2020-07-05T06:00+08:00","value":0.82},{"datetime":"2020-07-05T07:00+08:00","value":0.78},{"datetime":"2020-07-05T08:00+08:00","value":0.74},{"datetime":"2020-07-05T09:00+08:00","value":0.7},{"datetime":"2020-07-05T10:00+08:00","value":0.67},{"datetime":"2020-07-05T11:00+08:00","value":0.66},{"datetime":"2020-07-05T12:00+08:00","value":0.67},{"datetime":"2020-07-05T13:00+08:00","value":0.68}]
             * cloudrate : [{"datetime":"2020-07-03T14:00+08:00","value":0.9},{"datetime":"2020-07-03T15:00+08:00","value":0.9},{"datetime":"2020-07-03T16:00+08:00","value":1},{"datetime":"2020-07-03T17:00+08:00","value":0.99},{"datetime":"2020-07-03T18:00+08:00","value":0.98},{"datetime":"2020-07-03T19:00+08:00","value":0.98},{"datetime":"2020-07-03T20:00+08:00","value":0.98},{"datetime":"2020-07-03T21:00+08:00","value":1},{"datetime":"2020-07-03T22:00+08:00","value":1},{"datetime":"2020-07-03T23:00+08:00","value":1},{"datetime":"2020-07-04T00:00+08:00","value":1},{"datetime":"2020-07-04T01:00+08:00","value":1},{"datetime":"2020-07-04T02:00+08:00","value":0.97},{"datetime":"2020-07-04T03:00+08:00","value":1},{"datetime":"2020-07-04T04:00+08:00","value":1},{"datetime":"2020-07-04T05:00+08:00","value":0.99},{"datetime":"2020-07-04T06:00+08:00","value":0.98},{"datetime":"2020-07-04T07:00+08:00","value":0.98},{"datetime":"2020-07-04T08:00+08:00","value":0.99},{"datetime":"2020-07-04T09:00+08:00","value":1},{"datetime":"2020-07-04T10:00+08:00","value":1},{"datetime":"2020-07-04T11:00+08:00","value":0.94},{"datetime":"2020-07-04T12:00+08:00","value":0.75},{"datetime":"2020-07-04T13:00+08:00","value":0.72},{"datetime":"2020-07-04T14:00+08:00","value":0.72},{"datetime":"2020-07-04T15:00+08:00","value":0.28},{"datetime":"2020-07-04T16:00+08:00","value":0.52},{"datetime":"2020-07-04T17:00+08:00","value":0.54},{"datetime":"2020-07-04T18:00+08:00","value":0.63},{"datetime":"2020-07-04T19:00+08:00","value":0.7},{"datetime":"2020-07-04T20:00+08:00","value":0.75},{"datetime":"2020-07-04T21:00+08:00","value":1},{"datetime":"2020-07-04T22:00+08:00","value":1},{"datetime":"2020-07-04T23:00+08:00","value":1},{"datetime":"2020-07-05T00:00+08:00","value":1},{"datetime":"2020-07-05T01:00+08:00","value":1},{"datetime":"2020-07-05T02:00+08:00","value":1},{"datetime":"2020-07-05T03:00+08:00","value":1},{"datetime":"2020-07-05T04:00+08:00","value":0.98},{"datetime":"2020-07-05T05:00+08:00","value":0.98},{"datetime":"2020-07-05T06:00+08:00","value":0.99},{"datetime":"2020-07-05T07:00+08:00","value":0.99},{"datetime":"2020-07-05T08:00+08:00","value":0.98},{"datetime":"2020-07-05T09:00+08:00","value":0.07},{"datetime":"2020-07-05T10:00+08:00","value":0.24},{"datetime":"2020-07-05T11:00+08:00","value":0.46},{"datetime":"2020-07-05T12:00+08:00","value":0.59},{"datetime":"2020-07-05T13:00+08:00","value":0.68}]
             * skycon : [{"datetime":"2020-07-03T14:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-03T15:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-03T16:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-03T17:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-03T18:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-03T19:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-03T20:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-03T21:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-03T22:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-03T23:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-04T00:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-04T01:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-04T02:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-04T03:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-04T04:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-04T05:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-04T06:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-04T07:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-04T08:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-04T09:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-04T10:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-04T11:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-04T12:00+08:00","value":"PARTLY_CLOUDY_DAY"},{"datetime":"2020-07-04T13:00+08:00","value":"PARTLY_CLOUDY_DAY"},{"datetime":"2020-07-04T14:00+08:00","value":"PARTLY_CLOUDY_DAY"},{"datetime":"2020-07-04T15:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-07-04T16:00+08:00","value":"MODERATE_RAIN"},{"datetime":"2020-07-04T17:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-07-04T18:00+08:00","value":"PARTLY_CLOUDY_DAY"},{"datetime":"2020-07-04T19:00+08:00","value":"PARTLY_CLOUDY_NIGHT"},{"datetime":"2020-07-04T20:00+08:00","value":"PARTLY_CLOUDY_NIGHT"},{"datetime":"2020-07-04T21:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-04T22:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-04T23:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-05T00:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-05T01:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-05T02:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-05T03:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-05T04:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-05T05:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-05T06:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-05T07:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-05T08:00+08:00","value":"CLOUDY"},{"datetime":"2020-07-05T09:00+08:00","value":"CLEAR_DAY"},{"datetime":"2020-07-05T10:00+08:00","value":"PARTLY_CLOUDY_DAY"},{"datetime":"2020-07-05T11:00+08:00","value":"PARTLY_CLOUDY_DAY"},{"datetime":"2020-07-05T12:00+08:00","value":"LIGHT_RAIN"},{"datetime":"2020-07-05T13:00+08:00","value":"LIGHT_RAIN"}]
             * pressure : [{"datetime":"2020-07-03T14:00+08:00","value":99214.9624832001},{"datetime":"2020-07-03T15:00+08:00","value":99184.2899968001},{"datetime":"2020-07-03T16:00+08:00","value":99233.9539968001},{"datetime":"2020-07-03T17:00+08:00","value":99245.5544832001},{"datetime":"2020-07-03T18:00+08:00","value":99313.9539968001},{"datetime":"2020-07-03T19:00+08:00","value":99325.5544832001},{"datetime":"2020-07-03T20:00+08:00","value":99325.5544832001},{"datetime":"2020-07-03T21:00+08:00","value":99405.5544832001},{"datetime":"2020-07-03T22:00+08:00","value":99405.5544832001},{"datetime":"2020-07-03T23:00+08:00","value":99405.5544832001},{"datetime":"2020-07-04T00:00+08:00","value":99355.8904832001},{"datetime":"2020-07-04T01:00+08:00","value":99325.5544832001},{"datetime":"2020-07-04T02:00+08:00","value":99245.5544832001},{"datetime":"2020-07-04T03:00+08:00","value":99245.5544832},{"datetime":"2020-07-04T04:00+08:00","value":99275.8904832001},{"datetime":"2020-07-04T05:00+08:00","value":99325.5544832001},{"datetime":"2020-07-04T06:00+08:00","value":99325.5544832001},{"datetime":"2020-07-04T07:00+08:00","value":99325.5544832001},{"datetime":"2020-07-04T08:00+08:00","value":99325.5544832001},{"datetime":"2020-07-04T09:00+08:00","value":99386.5629696001},{"datetime":"2020-07-04T10:00+08:00","value":99405.5544832001},{"datetime":"2020-07-04T11:00+08:00","value":99356.2269696001},{"datetime":"2020-07-04T12:00+08:00","value":99313.9539968001},{"datetime":"2020-07-04T13:00+08:00","value":99215.2184832001},{"datetime":"2020-07-04T14:00+08:00","value":99104.6264832001},{"datetime":"2020-07-04T15:00+08:00","value":99073.9539968001},{"datetime":"2020-07-04T16:00+08:00","value":99005.5544832001},{"datetime":"2020-07-04T17:00+08:00","value":99073.9539968001},{"datetime":"2020-07-04T18:00+08:00","value":99104.2899968001},{"datetime":"2020-07-04T19:00+08:00","value":99104.2899968},{"datetime":"2020-07-04T20:00+08:00","value":99134.8819968001},{"datetime":"2020-07-04T21:00+08:00","value":99134.8819968001},{"datetime":"2020-07-04T22:00+08:00","value":99165.5544832},{"datetime":"2020-07-04T23:00+08:00","value":99165.5544832001},{"datetime":"2020-07-05T00:00+08:00","value":99165.5544832001},{"datetime":"2020-07-05T01:00+08:00","value":99085.5544832001},{"datetime":"2020-07-05T02:00+08:00","value":99005.5544832001},{"datetime":"2020-07-05T03:00+08:00","value":99005.5544832001},{"datetime":"2020-07-05T04:00+08:00","value":99005.5544832},{"datetime":"2020-07-05T05:00+08:00","value":99005.5544832001},{"datetime":"2020-07-05T06:00+08:00","value":99066.5629696001},{"datetime":"2020-07-05T07:00+08:00","value":99085.5544832001},{"datetime":"2020-07-05T08:00+08:00","value":99085.5544832001},{"datetime":"2020-07-05T09:00+08:00","value":99085.5544832001},{"datetime":"2020-07-05T10:00+08:00","value":99066.5629696001},{"datetime":"2020-07-05T11:00+08:00","value":99005.5544832001},{"datetime":"2020-07-05T12:00+08:00","value":98993.9539968001},{"datetime":"2020-07-05T13:00+08:00","value":98956.2269696001}]
             * visibility : [{"datetime":"2020-07-03T14:00+08:00","value":16},{"datetime":"2020-07-03T15:00+08:00","value":15.26},{"datetime":"2020-07-03T16:00+08:00","value":12.22},{"datetime":"2020-07-03T17:00+08:00","value":10.15},{"datetime":"2020-07-03T18:00+08:00","value":8.66},{"datetime":"2020-07-03T19:00+08:00","value":7.54},{"datetime":"2020-07-03T20:00+08:00","value":7.35},{"datetime":"2020-07-03T21:00+08:00","value":7.3},{"datetime":"2020-07-03T22:00+08:00","value":7.21},{"datetime":"2020-07-03T23:00+08:00","value":7.09},{"datetime":"2020-07-04T00:00+08:00","value":7.04},{"datetime":"2020-07-04T01:00+08:00","value":6.64},{"datetime":"2020-07-04T02:00+08:00","value":6.9},{"datetime":"2020-07-04T03:00+08:00","value":6.68},{"datetime":"2020-07-04T04:00+08:00","value":6.75},{"datetime":"2020-07-04T05:00+08:00","value":6.93},{"datetime":"2020-07-04T06:00+08:00","value":7.09},{"datetime":"2020-07-04T07:00+08:00","value":7.72},{"datetime":"2020-07-04T08:00+08:00","value":8.54},{"datetime":"2020-07-04T09:00+08:00","value":11.63},{"datetime":"2020-07-04T10:00+08:00","value":14.54},{"datetime":"2020-07-04T11:00+08:00","value":16},{"datetime":"2020-07-04T12:00+08:00","value":16},{"datetime":"2020-07-04T13:00+08:00","value":16},{"datetime":"2020-07-04T14:00+08:00","value":16},{"datetime":"2020-07-04T15:00+08:00","value":16},{"datetime":"2020-07-04T16:00+08:00","value":15.5},{"datetime":"2020-07-04T17:00+08:00","value":11.78},{"datetime":"2020-07-04T18:00+08:00","value":8.94},{"datetime":"2020-07-04T19:00+08:00","value":7.89},{"datetime":"2020-07-04T20:00+08:00","value":7.5},{"datetime":"2020-07-04T21:00+08:00","value":7.2},{"datetime":"2020-07-04T22:00+08:00","value":7.28},{"datetime":"2020-07-04T23:00+08:00","value":7.68},{"datetime":"2020-07-05T00:00+08:00","value":7.59},{"datetime":"2020-07-05T01:00+08:00","value":7.33},{"datetime":"2020-07-05T02:00+08:00","value":7.11},{"datetime":"2020-07-05T03:00+08:00","value":7.13},{"datetime":"2020-07-05T04:00+08:00","value":6.9},{"datetime":"2020-07-05T05:00+08:00","value":6.97},{"datetime":"2020-07-05T06:00+08:00","value":7.28},{"datetime":"2020-07-05T07:00+08:00","value":8.83},{"datetime":"2020-07-05T08:00+08:00","value":11.1},{"datetime":"2020-07-05T09:00+08:00","value":15.34},{"datetime":"2020-07-05T10:00+08:00","value":16},{"datetime":"2020-07-05T11:00+08:00","value":16},{"datetime":"2020-07-05T12:00+08:00","value":16},{"datetime":"2020-07-05T13:00+08:00","value":16}]
             * dswrf : [{"datetime":"2020-07-03T14:00+08:00","value":763.83973376},{"datetime":"2020-07-03T15:00+08:00","value":644.1420544},{"datetime":"2020-07-03T16:00+08:00","value":566.8689664},{"datetime":"2020-07-03T17:00+08:00","value":480.3693312},{"datetime":"2020-07-03T18:00+08:00","value":389.9195136},{"datetime":"2020-07-03T19:00+08:00","value":314.2276352},{"datetime":"2020-07-03T20:00+08:00","value":263.17904128},{"datetime":"2020-07-03T21:00+08:00","value":0},{"datetime":"2020-07-03T22:00+08:00","value":0},{"datetime":"2020-07-03T23:00+08:00","value":0},{"datetime":"2020-07-04T00:00+08:00","value":0},{"datetime":"2020-07-04T01:00+08:00","value":0},{"datetime":"2020-07-04T02:00+08:00","value":0},{"datetime":"2020-07-04T03:00+08:00","value":0},{"datetime":"2020-07-04T04:00+08:00","value":0},{"datetime":"2020-07-04T05:00+08:00","value":0},{"datetime":"2020-07-04T06:00+08:00","value":10},{"datetime":"2020-07-04T07:00+08:00","value":40},{"datetime":"2020-07-04T08:00+08:00","value":84.31620608},{"datetime":"2020-07-04T09:00+08:00","value":473.099392},{"datetime":"2020-07-04T10:00+08:00","value":566.125696},{"datetime":"2020-07-04T11:00+08:00","value":664.10681088},{"datetime":"2020-07-04T12:00+08:00","value":739.26613248},{"datetime":"2020-07-04T13:00+08:00","value":783.66202368},{"datetime":"2020-07-04T14:00+08:00","value":803.0214784},{"datetime":"2020-07-04T15:00+08:00","value":761.739392},{"datetime":"2020-07-04T16:00+08:00","value":677.915392},{"datetime":"2020-07-04T17:00+08:00","value":567.0975744},{"datetime":"2020-07-04T18:00+08:00","value":452.4036352},{"datetime":"2020-07-04T19:00+08:00","value":367.645696},{"datetime":"2020-07-04T20:00+08:00","value":306.50096896},{"datetime":"2020-07-04T21:00+08:00","value":0},{"datetime":"2020-07-04T22:00+08:00","value":0},{"datetime":"2020-07-04T23:00+08:00","value":0},{"datetime":"2020-07-05T00:00+08:00","value":0},{"datetime":"2020-07-05T01:00+08:00","value":0},{"datetime":"2020-07-05T02:00+08:00","value":0},{"datetime":"2020-07-05T03:00+08:00","value":0},{"datetime":"2020-07-05T04:00+08:00","value":0},{"datetime":"2020-07-05T05:00+08:00","value":0},{"datetime":"2020-07-05T06:00+08:00","value":10},{"datetime":"2020-07-05T07:00+08:00","value":40},{"datetime":"2020-07-05T08:00+08:00","value":96.79986688},{"datetime":"2020-07-05T09:00+08:00","value":632.3419392},{"datetime":"2020-07-05T10:00+08:00","value":709.0761216},{"datetime":"2020-07-05T11:00+08:00","value":749.00631552},{"datetime":"2020-07-05T12:00+08:00","value":766.63351552},{"datetime":"2020-07-05T13:00+08:00","value":760.24050944}]
             * air_quality : {"aqi":[{"datetime":"2020-07-03T14:00+08:00","value":{"chn":8,"usa":8}},{"datetime":"2020-07-03T15:00+08:00","value":{"chn":8,"usa":8}},{"datetime":"2020-07-03T16:00+08:00","value":{"chn":7,"usa":7}},{"datetime":"2020-07-03T17:00+08:00","value":{"chn":7,"usa":7}},{"datetime":"2020-07-03T18:00+08:00","value":{"chn":7,"usa":7}},{"datetime":"2020-07-03T19:00+08:00","value":{"chn":8,"usa":8}},{"datetime":"2020-07-03T20:00+08:00","value":{"chn":8,"usa":8}},{"datetime":"2020-07-03T21:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-07-03T22:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-07-03T23:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-07-04T00:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-07-04T01:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-07-04T02:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-07-04T03:00+08:00","value":{"chn":11,"usa":11}},{"datetime":"2020-07-04T04:00+08:00","value":{"chn":11,"usa":11}},{"datetime":"2020-07-04T05:00+08:00","value":{"chn":11,"usa":11}},{"datetime":"2020-07-04T06:00+08:00","value":{"chn":11,"usa":11}},{"datetime":"2020-07-04T07:00+08:00","value":{"chn":11,"usa":11}},{"datetime":"2020-07-04T08:00+08:00","value":{"chn":11,"usa":11}},{"datetime":"2020-07-04T09:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-07-04T10:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-07-04T11:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-07-04T12:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-07-04T13:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-07-04T14:00+08:00","value":{"chn":8,"usa":8}},{"datetime":"2020-07-04T15:00+08:00","value":{"chn":8,"usa":8}},{"datetime":"2020-07-04T16:00+08:00","value":{"chn":7,"usa":7}},{"datetime":"2020-07-04T17:00+08:00","value":{"chn":7,"usa":7}},{"datetime":"2020-07-04T18:00+08:00","value":{"chn":8,"usa":8}},{"datetime":"2020-07-04T19:00+08:00","value":{"chn":8,"usa":8}},{"datetime":"2020-07-04T20:00+08:00","value":{"chn":8,"usa":8}},{"datetime":"2020-07-04T21:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-07-04T22:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-07-04T23:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-07-05T00:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-07-05T01:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-07-05T02:00+08:00","value":{"chn":10,"usa":10}},{"datetime":"2020-07-05T03:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-07-05T04:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-07-05T05:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-07-05T06:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-07-05T07:00+08:00","value":{"chn":8,"usa":8}},{"datetime":"2020-07-05T08:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-07-05T09:00+08:00","value":{"chn":9,"usa":9}},{"datetime":"2020-07-05T10:00+08:00","value":{"chn":8,"usa":8}},{"datetime":"2020-07-05T11:00+08:00","value":{"chn":8,"usa":8}},{"datetime":"2020-07-05T12:00+08:00","value":{"chn":8,"usa":8}},{"datetime":"2020-07-05T13:00+08:00","value":{"chn":7,"usa":7}}],"pm25":[{"datetime":"2020-07-03T14:00+08:00","value":3},{"datetime":"2020-07-03T15:00+08:00","value":4},{"datetime":"2020-07-03T16:00+08:00","value":4},{"datetime":"2020-07-03T17:00+08:00","value":4},{"datetime":"2020-07-03T18:00+08:00","value":5},{"datetime":"2020-07-03T19:00+08:00","value":5},{"datetime":"2020-07-03T20:00+08:00","value":6},{"datetime":"2020-07-03T21:00+08:00","value":7},{"datetime":"2020-07-03T22:00+08:00","value":7},{"datetime":"2020-07-03T23:00+08:00","value":7},{"datetime":"2020-07-04T00:00+08:00","value":8},{"datetime":"2020-07-04T01:00+08:00","value":8},{"datetime":"2020-07-04T02:00+08:00","value":8},{"datetime":"2020-07-04T03:00+08:00","value":7},{"datetime":"2020-07-04T04:00+08:00","value":7},{"datetime":"2020-07-04T05:00+08:00","value":7},{"datetime":"2020-07-04T06:00+08:00","value":7},{"datetime":"2020-07-04T07:00+08:00","value":8},{"datetime":"2020-07-04T08:00+08:00","value":8},{"datetime":"2020-07-04T09:00+08:00","value":9},{"datetime":"2020-07-04T10:00+08:00","value":8},{"datetime":"2020-07-04T11:00+08:00","value":7},{"datetime":"2020-07-04T12:00+08:00","value":6},{"datetime":"2020-07-04T13:00+08:00","value":6},{"datetime":"2020-07-04T14:00+08:00","value":6},{"datetime":"2020-07-04T15:00+08:00","value":5},{"datetime":"2020-07-04T16:00+08:00","value":5},{"datetime":"2020-07-04T17:00+08:00","value":5},{"datetime":"2020-07-04T18:00+08:00","value":5},{"datetime":"2020-07-04T19:00+08:00","value":5},{"datetime":"2020-07-04T20:00+08:00","value":6},{"datetime":"2020-07-04T21:00+08:00","value":7},{"datetime":"2020-07-04T22:00+08:00","value":7},{"datetime":"2020-07-04T23:00+08:00","value":7},{"datetime":"2020-07-05T00:00+08:00","value":7},{"datetime":"2020-07-05T01:00+08:00","value":8},{"datetime":"2020-07-05T02:00+08:00","value":8},{"datetime":"2020-07-05T03:00+08:00","value":8},{"datetime":"2020-07-05T04:00+08:00","value":7},{"datetime":"2020-07-05T05:00+08:00","value":7},{"datetime":"2020-07-05T06:00+08:00","value":6},{"datetime":"2020-07-05T07:00+08:00","value":6},{"datetime":"2020-07-05T08:00+08:00","value":6},{"datetime":"2020-07-05T09:00+08:00","value":6},{"datetime":"2020-07-05T10:00+08:00","value":6},{"datetime":"2020-07-05T11:00+08:00","value":6},{"datetime":"2020-07-05T12:00+08:00","value":6},{"datetime":"2020-07-05T13:00+08:00","value":5}]}
             */

            private String status;
            private String description;
            private AirQualityBeanX air_quality;
            private List<PrecipitationBeanX> precipitation;
            private List<TemperatureBean> temperature;
            private List<WindBeanX> wind;
            private List<HumidityBean> humidity;
            private List<CloudrateBean> cloudrate;
            private List<SkyconBean> skycon;
            private List<PressureBean> pressure;
            private List<VisibilityBean> visibility;
            private List<DswrfBean> dswrf;

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }

            public AirQualityBeanX getAir_quality() {
                return air_quality;
            }

            public void setAir_quality(AirQualityBeanX air_quality) {
                this.air_quality = air_quality;
            }

            public List<PrecipitationBeanX> getPrecipitation() {
                return precipitation;
            }

            public void setPrecipitation(List<PrecipitationBeanX> precipitation) {
                this.precipitation = precipitation;
            }

            public List<TemperatureBean> getTemperature() {
                return temperature;
            }

            public void setTemperature(List<TemperatureBean> temperature) {
                this.temperature = temperature;
            }

            public List<WindBeanX> getWind() {
                return wind;
            }

            public void setWind(List<WindBeanX> wind) {
                this.wind = wind;
            }

            public List<HumidityBean> getHumidity() {
                return humidity;
            }

            public void setHumidity(List<HumidityBean> humidity) {
                this.humidity = humidity;
            }

            public List<CloudrateBean> getCloudrate() {
                return cloudrate;
            }

            public void setCloudrate(List<CloudrateBean> cloudrate) {
                this.cloudrate = cloudrate;
            }

            public List<SkyconBean> getSkycon() {
                return skycon;
            }

            public void setSkycon(List<SkyconBean> skycon) {
                this.skycon = skycon;
            }

            public List<PressureBean> getPressure() {
                return pressure;
            }

            public void setPressure(List<PressureBean> pressure) {
                this.pressure = pressure;
            }

            public List<VisibilityBean> getVisibility() {
                return visibility;
            }

            public void setVisibility(List<VisibilityBean> visibility) {
                this.visibility = visibility;
            }

            public List<DswrfBean> getDswrf() {
                return dswrf;
            }

            public void setDswrf(List<DswrfBean> dswrf) {
                this.dswrf = dswrf;
            }

            public static class AirQualityBeanX {
                private List<AqiBeanX> aqi;
                private List<Pm25Bean> pm25;

                public List<AqiBeanX> getAqi() {
                    return aqi;
                }

                public void setAqi(List<AqiBeanX> aqi) {
                    this.aqi = aqi;
                }

                public List<Pm25Bean> getPm25() {
                    return pm25;
                }

                public void setPm25(List<Pm25Bean> pm25) {
                    this.pm25 = pm25;
                }

                public static class AqiBeanX {
                    /**
                     * datetime : 2020-07-03T14:00+08:00
                     * value : {"chn":8,"usa":8}
                     */

                    private String datetime;
                    private ValueBean value;

                    public String getDatetime() {
                        return datetime;
                    }

                    public void setDatetime(String datetime) {
                        this.datetime = datetime;
                    }

                    public ValueBean getValue() {
                        return value;
                    }

                    public void setValue(ValueBean value) {
                        this.value = value;
                    }

                    public static class ValueBean {
                        /**
                         * chn : 8
                         * usa : 8
                         */

                        private int chn;
                        private int usa;

                        public int getChn() {
                            return chn;
                        }

                        public void setChn(int chn) {
                            this.chn = chn;
                        }

                        public int getUsa() {
                            return usa;
                        }

                        public void setUsa(int usa) {
                            this.usa = usa;
                        }
                    }
                }

                public static class Pm25Bean {
                    /**
                     * datetime : 2020-07-03T14:00+08:00
                     * value : 3
                     */

                    private String datetime;
                    private int value;

                    public String getDatetime() {
                        return datetime;
                    }

                    public void setDatetime(String datetime) {
                        this.datetime = datetime;
                    }

                    public int getValue() {
                        return value;
                    }

                    public void setValue(int value) {
                        this.value = value;
                    }
                }
            }

            public static class PrecipitationBeanX {
                /**
                 * datetime : 2020-07-03T14:00+08:00
                 * value : 0.0
                 */

                private String datetime;
                private double value;

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }

                public double getValue() {
                    return value;
                }

                public void setValue(double value) {
                    this.value = value;
                }
            }

            public static class TemperatureBean {
                /**
                 * datetime : 2020-07-03T14:00+08:00
                 * value : 32.16
                 */

                private String datetime;
                private double value;

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }

                public double getValue() {
                    return value;
                }

                public void setValue(double value) {
                    this.value = value;
                }
            }

            public static class WindBeanX {
                /**
                 * datetime : 2020-07-03T14:00+08:00
                 * speed : 30.96
                 * direction : 220.0
                 */

                private String datetime;
                private double speed;
                private double direction;

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }

                public double getSpeed() {
                    return speed;
                }

                public void setSpeed(double speed) {
                    this.speed = speed;
                }

                public double getDirection() {
                    return direction;
                }

                public void setDirection(double direction) {
                    this.direction = direction;
                }
            }

            public static class HumidityBean {
                /**
                 * datetime : 2020-07-03T14:00+08:00
                 * value : 0.7
                 */

                private String datetime;
                private double value;

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }

                public double getValue() {
                    return value;
                }

                public void setValue(double value) {
                    this.value = value;
                }
            }

            public static class CloudrateBean {
                /**
                 * datetime : 2020-07-03T14:00+08:00
                 * value : 0.9
                 */

                private String datetime;
                private double value;

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }

                public double getValue() {
                    return value;
                }

                public void setValue(double value) {
                    this.value = value;
                }
            }

            public static class SkyconBean {
                /**
                 * datetime : 2020-07-03T14:00+08:00
                 * value : CLOUDY
                 */

                private String datetime;
                private String value;

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }

            public static class PressureBean {
                /**
                 * datetime : 2020-07-03T14:00+08:00
                 * value : 99214.9624832001
                 */

                private String datetime;
                private double value;

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }

                public double getValue() {
                    return value;
                }

                public void setValue(double value) {
                    this.value = value;
                }
            }

            public static class VisibilityBean {
                /**
                 * datetime : 2020-07-03T14:00+08:00
                 * value : 16.0
                 */

                private String datetime;
                private double value;

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }

                public double getValue() {
                    return value;
                }

                public void setValue(double value) {
                    this.value = value;
                }
            }

            public static class DswrfBean {
                /**
                 * datetime : 2020-07-03T14:00+08:00
                 * value : 763.83973376
                 */

                private String datetime;
                private double value;

                public String getDatetime() {
                    return datetime;
                }

                public void setDatetime(String datetime) {
                    this.datetime = datetime;
                }

                public double getValue() {
                    return value;
                }

                public void setValue(double value) {
                    this.value = value;
                }
            }
        }

        public static class DailyBean {
            /**
             * status : ok
             * astro : [{"date":"2020-07-03T00:00+08:00","sunrise":{"time":"05:07"},"sunset":{"time":"18:47"}},{"date":"2020-07-04T00:00+08:00","sunrise":{"time":"05:08"},"sunset":{"time":"18:47"}},{"date":"2020-07-05T00:00+08:00","sunrise":{"time":"05:08"},"sunset":{"time":"18:47"}},{"date":"2020-07-06T00:00+08:00","sunrise":{"time":"05:08"},"sunset":{"time":"18:47"}},{"date":"2020-07-07T00:00+08:00","sunrise":{"time":"05:09"},"sunset":{"time":"18:47"}}]
             * precipitation : [{"date":"2020-07-03T00:00+08:00","max":0.057,"min":0,"avg":0.0057},{"date":"2020-07-04T00:00+08:00","max":1.4291,"min":0,"avg":0.0965},{"date":"2020-07-05T00:00+08:00","max":0.8518,"min":0,"avg":0.0496},{"date":"2020-07-06T00:00+08:00","max":0.3131,"min":0,"avg":0.0564},{"date":"2020-07-07T00:00+08:00","max":1.0025,"min":0,"avg":0.1742}]
             * temperature : [{"date":"2020-07-03T00:00+08:00","max":32.16,"min":26,"avg":28.29},{"date":"2020-07-04T00:00+08:00","max":31,"min":26,"avg":28.93},{"date":"2020-07-05T00:00+08:00","max":31,"min":26,"avg":28.47},{"date":"2020-07-06T00:00+08:00","max":31,"min":26,"avg":28.55},{"date":"2020-07-07T00:00+08:00","max":31,"min":26,"avg":28.54}]
             * wind : [{"date":"2020-07-03T00:00+08:00","max":{"speed":30.96,"direction":220},"min":{"speed":0.36,"direction":282.01},"avg":{"speed":4.97,"direction":223.75}},{"date":"2020-07-04T00:00+08:00","max":{"speed":9.03,"direction":212.93},"min":{"speed":0.8,"direction":9.78},"avg":{"speed":3.58,"direction":223.6}},{"date":"2020-07-05T00:00+08:00","max":{"speed":7.44,"direction":279.72},"min":{"speed":0.51,"direction":152.85},"avg":{"speed":3.3,"direction":229.92}},{"date":"2020-07-06T00:00+08:00","max":{"speed":6.77,"direction":273.26},"min":{"speed":0.72,"direction":225.05},"avg":{"speed":3.51,"direction":240.28}},{"date":"2020-07-07T00:00+08:00","max":{"speed":7.53,"direction":263.89},"min":{"speed":0.62,"direction":122.5},"avg":{"speed":4.64,"direction":241.72}}]
             * humidity : [{"date":"2020-07-03T00:00+08:00","max":0.83,"min":0.67,"avg":0.78},{"date":"2020-07-04T00:00+08:00","max":0.84,"min":0.66,"avg":0.77},{"date":"2020-07-05T00:00+08:00","max":0.83,"min":0.66,"avg":0.76},{"date":"2020-07-06T00:00+08:00","max":0.83,"min":0.67,"avg":0.77},{"date":"2020-07-07T00:00+08:00","max":0.84,"min":0.67,"avg":0.76}]
             * cloudrate : [{"date":"2020-07-03T00:00+08:00","max":1,"min":0.85,"avg":0.97},{"date":"2020-07-04T00:00+08:00","max":1,"min":0.28,"avg":0.85},{"date":"2020-07-05T00:00+08:00","max":1,"min":0.07,"avg":0.84},{"date":"2020-07-06T00:00+08:00","max":1,"min":0.95,"avg":0.99},{"date":"2020-07-07T00:00+08:00","max":1,"min":0.82,"avg":0.98}]
             * pressure : [{"date":"2020-07-03T00:00+08:00","max":99405.55,"min":99165.55,"avg":99306.05},{"date":"2020-07-04T00:00+08:00","max":99405.55,"min":99005.55,"avg":99228.99},{"date":"2020-07-05T00:00+08:00","max":99165.55,"min":98814.96,"avg":98988.2},{"date":"2020-07-06T00:00+08:00","max":99245.55,"min":98864.29,"avg":99028.96},{"date":"2020-07-07T00:00+08:00","max":99405.55,"min":99115.89,"avg":99257.06}]
             * visibility : [{"date":"2020-07-03T00:00+08:00","max":24.13,"min":7.09,"avg":9.88},{"date":"2020-07-04T00:00+08:00","max":16,"min":6.64,"avg":10.18},{"date":"2020-07-05T00:00+08:00","max":16,"min":6.9,"avg":11.02},{"date":"2020-07-06T00:00+08:00","max":16,"min":6.92,"avg":10.49},{"date":"2020-07-07T00:00+08:00","max":16,"min":6.79,"avg":10.61}]
             * dswrf : [{"date":"2020-07-03T00:00+08:00","max":763.8,"min":0,"avg":342.3},{"date":"2020-07-04T00:00+08:00","max":803,"min":0,"avg":304},{"date":"2020-07-05T00:00+08:00","max":766.6,"min":0,"avg":311.5},{"date":"2020-07-06T00:00+08:00","max":786.2,"min":0,"avg":294.1},{"date":"2020-07-07T00:00+08:00","max":760.9,"min":0,"avg":278.5}]
             * air_quality : {"aqi":[{"date":"2020-07-03T00:00+08:00","max":{"chn":11,"usa":11},"avg":{"chn":8,"usa":8},"min":{"chn":7,"usa":7}},{"date":"2020-07-04T00:00+08:00","max":{"chn":11,"usa":11},"avg":{"chn":9.42,"usa":9.42},"min":{"chn":7,"usa":7}},{"date":"2020-07-05T00:00+08:00","max":{"chn":10,"usa":10},"avg":{"chn":8.29,"usa":8.29},"min":{"chn":7,"usa":7}},{"date":"2020-07-06T00:00+08:00","max":{"chn":10,"usa":10},"avg":{"chn":8.12,"usa":8.12},"min":{"chn":7,"usa":7}},{"date":"2020-07-07T00:00+08:00","max":{"chn":8,"usa":8},"avg":{"chn":7.62,"usa":7.62},"min":{"chn":7,"usa":7}}],"pm25":[{"date":"2020-07-03T00:00+08:00","max":7,"avg":5.2,"min":3},{"date":"2020-07-04T00:00+08:00","max":9,"avg":6.75,"min":5},{"date":"2020-07-05T00:00+08:00","max":8,"avg":5.88,"min":3},{"date":"2020-07-06T00:00+08:00","max":8,"avg":5.33,"min":3},{"date":"2020-07-07T00:00+08:00","max":5,"avg":4.08,"min":3}]}
             * skycon : [{"date":"2020-07-03T00:00+08:00","value":"CLOUDY"},{"date":"2020-07-04T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-07-05T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-07-06T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-07-07T00:00+08:00","value":"LIGHT_RAIN"}]
             * skycon_08h_20h : [{"date":"2020-07-03T00:00+08:00","value":"CLOUDY"},{"date":"2020-07-04T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-07-05T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-07-06T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-07-07T00:00+08:00","value":"LIGHT_RAIN"}]
             * skycon_20h_32h : [{"date":"2020-07-03T00:00+08:00","value":"CLOUDY"},{"date":"2020-07-04T00:00+08:00","value":"CLOUDY"},{"date":"2020-07-05T00:00+08:00","value":"CLOUDY"},{"date":"2020-07-06T00:00+08:00","value":"LIGHT_RAIN"},{"date":"2020-07-07T00:00+08:00","value":"LIGHT_RAIN"}]
             * life_index : {"ultraviolet":[{"date":"2020-07-03T00:00+08:00","index":"1","desc":"最弱"},{"date":"2020-07-04T00:00+08:00","index":"1","desc":"最弱"},{"date":"2020-07-05T00:00+08:00","index":"3","desc":"中等"},{"date":"2020-07-06T00:00+08:00","index":"1","desc":"最弱"},{"date":"2020-07-07T00:00+08:00","index":"1","desc":"最弱"}],"carWashing":[{"date":"2020-07-03T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-07-04T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-07-05T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-07-06T00:00+08:00","index":"3","desc":"较不适宜"},{"date":"2020-07-07T00:00+08:00","index":"3","desc":"较不适宜"}],"dressing":[{"date":"2020-07-03T00:00+08:00","index":"2","desc":"很热"},{"date":"2020-07-04T00:00+08:00","index":"2","desc":"很热"},{"date":"2020-07-05T00:00+08:00","index":"2","desc":"很热"},{"date":"2020-07-06T00:00+08:00","index":"2","desc":"很热"},{"date":"2020-07-07T00:00+08:00","index":"2","desc":"很热"}],"comfort":[{"date":"2020-07-03T00:00+08:00","index":"0","desc":"闷热"},{"date":"2020-07-04T00:00+08:00","index":"0","desc":"闷热"},{"date":"2020-07-05T00:00+08:00","index":"0","desc":"闷热"},{"date":"2020-07-06T00:00+08:00","index":"0","desc":"闷热"},{"date":"2020-07-07T00:00+08:00","index":"0","desc":"闷热"}],"coldRisk":[{"date":"2020-07-03T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-07-04T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-07-05T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-07-06T00:00+08:00","index":"3","desc":"易发"},{"date":"2020-07-07T00:00+08:00","index":"3","desc":"易发"}]}
             */

            private String status;
            private AirQualityBeanXX air_quality;
            private LifeIndexBeanX life_index;
            private List<AstroBean> astro;
            private List<PrecipitationBeanXX> precipitation;
            private List<TemperatureBeanX> temperature;
            private List<WindBeanXX> wind;
            private List<HumidityBeanX> humidity;
            private List<CloudrateBeanX> cloudrate;
            private List<PressureBeanX> pressure;
            private List<VisibilityBeanX> visibility;
            private List<DswrfBeanX> dswrf;
            private List<SkyconBeanX> skycon;
            private List<Skycon08h20hBean> skycon_08h_20h;
            private List<Skycon20h32hBean> skycon_20h_32h;

            public String getStatus() {
                return status;
            }

            public void setStatus(String status) {
                this.status = status;
            }

            public AirQualityBeanXX getAir_quality() {
                return air_quality;
            }

            public void setAir_quality(AirQualityBeanXX air_quality) {
                this.air_quality = air_quality;
            }

            public LifeIndexBeanX getLife_index() {
                return life_index;
            }

            public void setLife_index(LifeIndexBeanX life_index) {
                this.life_index = life_index;
            }

            public List<AstroBean> getAstro() {
                return astro;
            }

            public void setAstro(List<AstroBean> astro) {
                this.astro = astro;
            }

            public List<PrecipitationBeanXX> getPrecipitation() {
                return precipitation;
            }

            public void setPrecipitation(List<PrecipitationBeanXX> precipitation) {
                this.precipitation = precipitation;
            }

            public List<TemperatureBeanX> getTemperature() {
                return temperature;
            }

            public void setTemperature(List<TemperatureBeanX> temperature) {
                this.temperature = temperature;
            }

            public List<WindBeanXX> getWind() {
                return wind;
            }

            public void setWind(List<WindBeanXX> wind) {
                this.wind = wind;
            }

            public List<HumidityBeanX> getHumidity() {
                return humidity;
            }

            public void setHumidity(List<HumidityBeanX> humidity) {
                this.humidity = humidity;
            }

            public List<CloudrateBeanX> getCloudrate() {
                return cloudrate;
            }

            public void setCloudrate(List<CloudrateBeanX> cloudrate) {
                this.cloudrate = cloudrate;
            }

            public List<PressureBeanX> getPressure() {
                return pressure;
            }

            public void setPressure(List<PressureBeanX> pressure) {
                this.pressure = pressure;
            }

            public List<VisibilityBeanX> getVisibility() {
                return visibility;
            }

            public void setVisibility(List<VisibilityBeanX> visibility) {
                this.visibility = visibility;
            }

            public List<DswrfBeanX> getDswrf() {
                return dswrf;
            }

            public void setDswrf(List<DswrfBeanX> dswrf) {
                this.dswrf = dswrf;
            }

            public List<SkyconBeanX> getSkycon() {
                return skycon;
            }

            public void setSkycon(List<SkyconBeanX> skycon) {
                this.skycon = skycon;
            }

            public List<Skycon08h20hBean> getSkycon_08h_20h() {
                return skycon_08h_20h;
            }

            public void setSkycon_08h_20h(List<Skycon08h20hBean> skycon_08h_20h) {
                this.skycon_08h_20h = skycon_08h_20h;
            }

            public List<Skycon20h32hBean> getSkycon_20h_32h() {
                return skycon_20h_32h;
            }

            public void setSkycon_20h_32h(List<Skycon20h32hBean> skycon_20h_32h) {
                this.skycon_20h_32h = skycon_20h_32h;
            }

            public static class AirQualityBeanXX {
                private List<AqiBeanXX> aqi;
                private List<Pm25BeanX> pm25;

                public List<AqiBeanXX> getAqi() {
                    return aqi;
                }

                public void setAqi(List<AqiBeanXX> aqi) {
                    this.aqi = aqi;
                }

                public List<Pm25BeanX> getPm25() {
                    return pm25;
                }

                public void setPm25(List<Pm25BeanX> pm25) {
                    this.pm25 = pm25;
                }

                public static class AqiBeanXX {
                    /**
                     * date : 2020-07-03T00:00+08:00
                     * max : {"chn":11,"usa":11}
                     * avg : {"chn":8,"usa":8}
                     * min : {"chn":7,"usa":7}
                     */

                    private String date;
                    private MaxBean max;
                    private AvgBean avg;
                    private MinBean min;

                    public String getDate() {
                        return date;
                    }

                    public void setDate(String date) {
                        this.date = date;
                    }

                    public MaxBean getMax() {
                        return max;
                    }

                    public void setMax(MaxBean max) {
                        this.max = max;
                    }

                    public AvgBean getAvg() {
                        return avg;
                    }

                    public void setAvg(AvgBean avg) {
                        this.avg = avg;
                    }

                    public MinBean getMin() {
                        return min;
                    }

                    public void setMin(MinBean min) {
                        this.min = min;
                    }

                    public static class MaxBean {
                        /**
                         * chn : 11
                         * usa : 11
                         */

                        private int chn;
                        private int usa;

                        public int getChn() {
                            return chn;
                        }

                        public void setChn(int chn) {
                            this.chn = chn;
                        }

                        public int getUsa() {
                            return usa;
                        }

                        public void setUsa(int usa) {
                            this.usa = usa;
                        }
                    }

                    public static class AvgBean {
                        /**
                         * chn : 8.0
                         * usa : 8.0
                         */

                        private double chn;
                        private double usa;

                        public double getChn() {
                            return chn;
                        }

                        public void setChn(double chn) {
                            this.chn = chn;
                        }

                        public double getUsa() {
                            return usa;
                        }

                        public void setUsa(double usa) {
                            this.usa = usa;
                        }
                    }

                    public static class MinBean {
                        /**
                         * chn : 7
                         * usa : 7
                         */

                        private int chn;
                        private int usa;

                        public int getChn() {
                            return chn;
                        }

                        public void setChn(int chn) {
                            this.chn = chn;
                        }

                        public int getUsa() {
                            return usa;
                        }

                        public void setUsa(int usa) {
                            this.usa = usa;
                        }
                    }
                }

                public static class Pm25BeanX {
                    /**
                     * date : 2020-07-03T00:00+08:00
                     * max : 7
                     * avg : 5.2
                     * min : 3
                     */

                    private String date;
                    private int max;
                    private double avg;
                    private int min;

                    public String getDate() {
                        return date;
                    }

                    public void setDate(String date) {
                        this.date = date;
                    }

                    public int getMax() {
                        return max;
                    }

                    public void setMax(int max) {
                        this.max = max;
                    }

                    public double getAvg() {
                        return avg;
                    }

                    public void setAvg(double avg) {
                        this.avg = avg;
                    }

                    public int getMin() {
                        return min;
                    }

                    public void setMin(int min) {
                        this.min = min;
                    }
                }
            }

            public static class LifeIndexBeanX {
                private List<UltravioletBeanX> ultraviolet;
                private List<CarWashingBean> carWashing;
                private List<DressingBean> dressing;
                private List<ComfortBeanX> comfort;
                private List<ColdRiskBean> coldRisk;

                public List<UltravioletBeanX> getUltraviolet() {
                    return ultraviolet;
                }

                public void setUltraviolet(List<UltravioletBeanX> ultraviolet) {
                    this.ultraviolet = ultraviolet;
                }

                public List<CarWashingBean> getCarWashing() {
                    return carWashing;
                }

                public void setCarWashing(List<CarWashingBean> carWashing) {
                    this.carWashing = carWashing;
                }

                public List<DressingBean> getDressing() {
                    return dressing;
                }

                public void setDressing(List<DressingBean> dressing) {
                    this.dressing = dressing;
                }

                public List<ComfortBeanX> getComfort() {
                    return comfort;
                }

                public void setComfort(List<ComfortBeanX> comfort) {
                    this.comfort = comfort;
                }

                public List<ColdRiskBean> getColdRisk() {
                    return coldRisk;
                }

                public void setColdRisk(List<ColdRiskBean> coldRisk) {
                    this.coldRisk = coldRisk;
                }

                public static class UltravioletBeanX {
                    /**
                     * date : 2020-07-03T00:00+08:00
                     * index : 1
                     * desc : 最弱
                     */

                    private String date;
                    private String index;
                    private String desc;

                    public String getDate() {
                        return date;
                    }

                    public void setDate(String date) {
                        this.date = date;
                    }

                    public String getIndex() {
                        return index;
                    }

                    public void setIndex(String index) {
                        this.index = index;
                    }

                    public String getDesc() {
                        return desc;
                    }

                    public void setDesc(String desc) {
                        this.desc = desc;
                    }
                }

                public static class CarWashingBean {
                    /**
                     * date : 2020-07-03T00:00+08:00
                     * index : 3
                     * desc : 较不适宜
                     */

                    private String date;
                    private String index;
                    private String desc;

                    public String getDate() {
                        return date;
                    }

                    public void setDate(String date) {
                        this.date = date;
                    }

                    public String getIndex() {
                        return index;
                    }

                    public void setIndex(String index) {
                        this.index = index;
                    }

                    public String getDesc() {
                        return desc;
                    }

                    public void setDesc(String desc) {
                        this.desc = desc;
                    }
                }

                public static class DressingBean {
                    /**
                     * date : 2020-07-03T00:00+08:00
                     * index : 2
                     * desc : 很热
                     */

                    private String date;
                    private String index;
                    private String desc;

                    public String getDate() {
                        return date;
                    }

                    public void setDate(String date) {
                        this.date = date;
                    }

                    public String getIndex() {
                        return index;
                    }

                    public void setIndex(String index) {
                        this.index = index;
                    }

                    public String getDesc() {
                        return desc;
                    }

                    public void setDesc(String desc) {
                        this.desc = desc;
                    }
                }

                public static class ComfortBeanX {
                    /**
                     * date : 2020-07-03T00:00+08:00
                     * index : 0
                     * desc : 闷热
                     */

                    private String date;
                    private String index;
                    private String desc;

                    public String getDate() {
                        return date;
                    }

                    public void setDate(String date) {
                        this.date = date;
                    }

                    public String getIndex() {
                        return index;
                    }

                    public void setIndex(String index) {
                        this.index = index;
                    }

                    public String getDesc() {
                        return desc;
                    }

                    public void setDesc(String desc) {
                        this.desc = desc;
                    }
                }

                public static class ColdRiskBean {
                    /**
                     * date : 2020-07-03T00:00+08:00
                     * index : 3
                     * desc : 易发
                     */

                    private String date;
                    private String index;
                    private String desc;

                    public String getDate() {
                        return date;
                    }

                    public void setDate(String date) {
                        this.date = date;
                    }

                    public String getIndex() {
                        return index;
                    }

                    public void setIndex(String index) {
                        this.index = index;
                    }

                    public String getDesc() {
                        return desc;
                    }

                    public void setDesc(String desc) {
                        this.desc = desc;
                    }
                }
            }

            public static class AstroBean {
                /**
                 * date : 2020-07-03T00:00+08:00
                 * sunrise : {"time":"05:07"}
                 * sunset : {"time":"18:47"}
                 */

                private String date;
                private SunriseBean sunrise;
                private SunsetBean sunset;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public SunriseBean getSunrise() {
                    return sunrise;
                }

                public void setSunrise(SunriseBean sunrise) {
                    this.sunrise = sunrise;
                }

                public SunsetBean getSunset() {
                    return sunset;
                }

                public void setSunset(SunsetBean sunset) {
                    this.sunset = sunset;
                }

                public static class SunriseBean {
                    /**
                     * time : 05:07
                     */

                    private String time;

                    public String getTime() {
                        return time;
                    }

                    public void setTime(String time) {
                        this.time = time;
                    }
                }

                public static class SunsetBean {
                    /**
                     * time : 18:47
                     */

                    private String time;

                    public String getTime() {
                        return time;
                    }

                    public void setTime(String time) {
                        this.time = time;
                    }
                }
            }

            public static class PrecipitationBeanXX {
                /**
                 * date : 2020-07-03T00:00+08:00
                 * max : 0.057
                 * min : 0.0
                 * avg : 0.0057
                 */

                private String date;
                private double max;
                private double min;
                private double avg;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public double getMax() {
                    return max;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public double getMin() {
                    return min;
                }

                public void setMin(double min) {
                    this.min = min;
                }

                public double getAvg() {
                    return avg;
                }

                public void setAvg(double avg) {
                    this.avg = avg;
                }
            }

            public static class TemperatureBeanX {
                /**
                 * date : 2020-07-03T00:00+08:00
                 * max : 32.16
                 * min : 26.0
                 * avg : 28.29
                 */

                private String date;
                private double max;
                private double min;
                private double avg;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public double getMax() {
                    return max;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public double getMin() {
                    return min;
                }

                public void setMin(double min) {
                    this.min = min;
                }

                public double getAvg() {
                    return avg;
                }

                public void setAvg(double avg) {
                    this.avg = avg;
                }
            }

            public static class WindBeanXX {
                /**
                 * date : 2020-07-03T00:00+08:00
                 * max : {"speed":30.96,"direction":220}
                 * min : {"speed":0.36,"direction":282.01}
                 * avg : {"speed":4.97,"direction":223.75}
                 */

                private String date;
                private MaxBeanX max;
                private MinBeanX min;
                private AvgBeanX avg;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public MaxBeanX getMax() {
                    return max;
                }

                public void setMax(MaxBeanX max) {
                    this.max = max;
                }

                public MinBeanX getMin() {
                    return min;
                }

                public void setMin(MinBeanX min) {
                    this.min = min;
                }

                public AvgBeanX getAvg() {
                    return avg;
                }

                public void setAvg(AvgBeanX avg) {
                    this.avg = avg;
                }

                public static class MaxBeanX {
                    /**
                     * speed : 30.96
                     * direction : 220.0
                     */

                    private double speed;
                    private double direction;

                    public double getSpeed() {
                        return speed;
                    }

                    public void setSpeed(double speed) {
                        this.speed = speed;
                    }

                    public double getDirection() {
                        return direction;
                    }

                    public void setDirection(double direction) {
                        this.direction = direction;
                    }
                }

                public static class MinBeanX {
                    /**
                     * speed : 0.36
                     * direction : 282.01
                     */

                    private double speed;
                    private double direction;

                    public double getSpeed() {
                        return speed;
                    }

                    public void setSpeed(double speed) {
                        this.speed = speed;
                    }

                    public double getDirection() {
                        return direction;
                    }

                    public void setDirection(double direction) {
                        this.direction = direction;
                    }
                }

                public static class AvgBeanX {
                    /**
                     * speed : 4.97
                     * direction : 223.75
                     */

                    private double speed;
                    private double direction;

                    public double getSpeed() {
                        return speed;
                    }

                    public void setSpeed(double speed) {
                        this.speed = speed;
                    }

                    public double getDirection() {
                        return direction;
                    }

                    public void setDirection(double direction) {
                        this.direction = direction;
                    }
                }
            }

            public static class HumidityBeanX {
                /**
                 * date : 2020-07-03T00:00+08:00
                 * max : 0.83
                 * min : 0.67
                 * avg : 0.78
                 */

                private String date;
                private double max;
                private double min;
                private double avg;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public double getMax() {
                    return max;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public double getMin() {
                    return min;
                }

                public void setMin(double min) {
                    this.min = min;
                }

                public double getAvg() {
                    return avg;
                }

                public void setAvg(double avg) {
                    this.avg = avg;
                }
            }

            public static class CloudrateBeanX {
                /**
                 * date : 2020-07-03T00:00+08:00
                 * max : 1.0
                 * min : 0.85
                 * avg : 0.97
                 */

                private String date;
                private double max;
                private double min;
                private double avg;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public double getMax() {
                    return max;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public double getMin() {
                    return min;
                }

                public void setMin(double min) {
                    this.min = min;
                }

                public double getAvg() {
                    return avg;
                }

                public void setAvg(double avg) {
                    this.avg = avg;
                }
            }

            public static class PressureBeanX {
                /**
                 * date : 2020-07-03T00:00+08:00
                 * max : 99405.55
                 * min : 99165.55
                 * avg : 99306.05
                 */

                private String date;
                private double max;
                private double min;
                private double avg;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public double getMax() {
                    return max;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public double getMin() {
                    return min;
                }

                public void setMin(double min) {
                    this.min = min;
                }

                public double getAvg() {
                    return avg;
                }

                public void setAvg(double avg) {
                    this.avg = avg;
                }
            }

            public static class VisibilityBeanX {
                /**
                 * date : 2020-07-03T00:00+08:00
                 * max : 24.13
                 * min : 7.09
                 * avg : 9.88
                 */

                private String date;
                private double max;
                private double min;
                private double avg;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public double getMax() {
                    return max;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public double getMin() {
                    return min;
                }

                public void setMin(double min) {
                    this.min = min;
                }

                public double getAvg() {
                    return avg;
                }

                public void setAvg(double avg) {
                    this.avg = avg;
                }
            }

            public static class DswrfBeanX {
                /**
                 * date : 2020-07-03T00:00+08:00
                 * max : 763.8
                 * min : 0.0
                 * avg : 342.3
                 */

                private String date;
                private double max;
                private double min;
                private double avg;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public double getMax() {
                    return max;
                }

                public void setMax(double max) {
                    this.max = max;
                }

                public double getMin() {
                    return min;
                }

                public void setMin(double min) {
                    this.min = min;
                }

                public double getAvg() {
                    return avg;
                }

                public void setAvg(double avg) {
                    this.avg = avg;
                }
            }

            public static class SkyconBeanX {
                /**
                 * date : 2020-07-03T00:00+08:00
                 * value : CLOUDY
                 */

                private String date;
                private String value;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }

            public static class Skycon08h20hBean {
                /**
                 * date : 2020-07-03T00:00+08:00
                 * value : CLOUDY
                 */

                private String date;
                private String value;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }

            public static class Skycon20h32hBean {
                /**
                 * date : 2020-07-03T00:00+08:00
                 * value : CLOUDY
                 */

                private String date;
                private String value;

                public String getDate() {
                    return date;
                }

                public void setDate(String date) {
                    this.date = date;
                }

                public String getValue() {
                    return value;
                }

                public void setValue(String value) {
                    this.value = value;
                }
            }
        }
    }
}
