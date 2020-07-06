package com.study.retrofit;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: AndroidStudy
 * @description: 彩云天气实时预报apibean
 * @author: Adolf
 * @create: 2020-07-03 15:27
 **/
@NoArgsConstructor
@Data
public class CYRealtimeBean {

    /**
     * status : ok
     * api_version : v2.5
     * api_status : active
     * lang : zh_CN
     * unit : metric
     * tzshift : 28800
     * timezone : Asia/Taipei
     * server_time : 1593761202
     * location : [25.1552,121.6544]
     * result : {"realtime":{"status":"ok","temperature":29,"humidity":0.7,"cloudrate":1,"skycon":"CLOUDY","visibility":24.08,"dswrf":644.1,"wind":{"speed":5.84,"direction":325.62},"pressure":99184.29,"apparent_temperature":32,"precipitation":{"local":{"status":"ok","datasource":"radar","intensity":0},"nearest":{"status":"ok","distance":17,"intensity":2}},"air_quality":{"pm25":4,"pm10":0,"o3":0,"so2":0,"no2":0,"co":0,"aqi":{"chn":8,"usa":0},"description":{"usa":"","chn":"优"}},"life_index":{"ultraviolet":{"index":2,"desc":"很弱"},"comfort":{"index":0,"desc":"闷热"}}},"primary":0}
     */

    private String status;
    private String apiVersion;
    private String apiStatus;
    private String lang;
    private String unit;
    private int tzshift;
    private String timezone;
    private int serverTime;
    private ResultBean result;
    private List<Double> location;

    @NoArgsConstructor
    @Data
    public static class ResultBean {
        /**
         * realtime : {"status":"ok","temperature":29,"humidity":0.7,"cloudrate":1,"skycon":"CLOUDY","visibility":24.08,"dswrf":644.1,"wind":{"speed":5.84,"direction":325.62},"pressure":99184.29,"apparent_temperature":32,"precipitation":{"local":{"status":"ok","datasource":"radar","intensity":0},"nearest":{"status":"ok","distance":17,"intensity":2}},"air_quality":{"pm25":4,"pm10":0,"o3":0,"so2":0,"no2":0,"co":0,"aqi":{"chn":8,"usa":0},"description":{"usa":"","chn":"优"}},"life_index":{"ultraviolet":{"index":2,"desc":"很弱"},"comfort":{"index":0,"desc":"闷热"}}}
         * primary : 0
         */

        private RealtimeBean realtime;
        private int primary;

        @NoArgsConstructor
        @Data
        public static class RealtimeBean {
            /**
             * status : ok
             * temperature : 29
             * humidity : 0.7
             * cloudrate : 1
             * skycon : CLOUDY
             * visibility : 24.08
             * dswrf : 644.1
             * wind : {"speed":5.84,"direction":325.62}
             * pressure : 99184.29
             * apparent_temperature : 32
             * precipitation : {"local":{"status":"ok","datasource":"radar","intensity":0},"nearest":{"status":"ok","distance":17,"intensity":2}}
             * air_quality : {"pm25":4,"pm10":0,"o3":0,"so2":0,"no2":0,"co":0,"aqi":{"chn":8,"usa":0},"description":{"usa":"","chn":"优"}}
             * life_index : {"ultraviolet":{"index":2,"desc":"很弱"},"comfort":{"index":0,"desc":"闷热"}}
             */

            private String status;
            private int temperature;
            private double humidity;
            private int cloudrate;
            private String skycon;
            private double visibility;
            private double dswrf;
            private WindBean wind;
            private double pressure;
            private int apparentTemperature;
            private PrecipitationBean precipitation;
            private AirQualityBean airQuality;
            private LifeIndexBean lifeIndex;

            @NoArgsConstructor
            @Data
            public static class WindBean {
                /**
                 * speed : 5.84
                 * direction : 325.62
                 */

                private double speed;
                private double direction;
            }

            @NoArgsConstructor
            @Data
            public static class PrecipitationBean {
                /**
                 * local : {"status":"ok","datasource":"radar","intensity":0}
                 * nearest : {"status":"ok","distance":17,"intensity":2}
                 */

                private LocalBean local;
                private NearestBean nearest;

                @NoArgsConstructor
                @Data
                public static class LocalBean {
                    /**
                     * status : ok
                     * datasource : radar
                     * intensity : 0
                     */

                    private String status;
                    private String datasource;
                    private int intensity;
                }

                @NoArgsConstructor
                @Data
                public static class NearestBean {
                    /**
                     * status : ok
                     * distance : 17
                     * intensity : 2
                     */

                    private String status;
                    private int distance;
                    private int intensity;
                }
            }

            @NoArgsConstructor
            @Data
            public static class AirQualityBean {
                /**
                 * pm25 : 4
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

                @NoArgsConstructor
                @Data
                public static class AqiBean {
                    /**
                     * chn : 8
                     * usa : 0
                     */

                    private int chn;
                    private int usa;
                }

                @NoArgsConstructor
                @Data
                public static class DescriptionBean {
                    /**
                     * usa :
                     * chn : 优
                     */

                    private String usa;
                    private String chn;
                }
            }

            @NoArgsConstructor
            @Data
            public static class LifeIndexBean {
                /**
                 * ultraviolet : {"index":2,"desc":"很弱"}
                 * comfort : {"index":0,"desc":"闷热"}
                 */

                private UltravioletBean ultraviolet;
                private ComfortBean comfort;

                @NoArgsConstructor
                @Data
                public static class UltravioletBean {
                    /**
                     * index : 2
                     * desc : 很弱
                     */

                    private int index;
                    private String desc;
                }

                @NoArgsConstructor
                @Data
                public static class ComfortBean {
                    /**
                     * index : 0
                     * desc : 闷热
                     */

                    private int index;
                    private String desc;
                }
            }
        }
    }
}
