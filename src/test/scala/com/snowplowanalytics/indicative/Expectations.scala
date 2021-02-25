/*
 * Copyright (c) 2018-2019 Snowplow Analytics Ltd. All rights reserved.
 *
 * This program is licensed to you under the Apache License Version 2.0,
 * and you may not use this file except in compliance with the Apache License Version 2.0.
 * You may obtain a copy of the Apache License Version 2.0 at http://www.apache.org/licenses/LICENSE-2.0.
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the Apache License Version 2.0 is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the Apache License Version 2.0 for the specific language governing permissions and limitations there under.
 */
package com.snowplowanalytics.indicative

// Circe
import io.circe.literal._

object Expectations {

  val unfilteredIndicativeEvent = json"""
      {
        "eventName": "link_click",
        "eventUniqueId": "jon.doe@email.com",
        "eventTime": 1532217837886,
        "properties": {
           "page_urlhost" : "www.snowplowanalytics.com",
           "etl_tstamp" : "2018-07-20T00:01:25.292Z",
           "web_page_inLanguage" : "en-US",
           "geo_latitude" : 37.443604,
           "performance_timing_domContentLoadedEventEnd" : 1415358091309,
           "performance_timing_domainLookupStart" : 1415358090102,
           "v_collector" : "clj-tomcat-0.1.0",
           "collector_tstamp" : "2018-07-20T00:02:05Z",
           "performance_timing_unloadEventEnd" : 1415358090287,
           "event_vendor" : "com.snowplowanalytics.snowplow",
           "network_userid" : "ecdff4d0-9175-40ac-a8bb-325c49733607",
           "performance_timing_requestStart" : 1415358090183,
           "geo_country" : "US",
           "user_fingerprint" : "2161814971",
           "performance_timing_responseStart" : 1415358090265,
           "page_urlscheme" : "http",
           "ua_parser_context_useragentFamily" : "IE",
           "event" : "unstruct",
           "user_ipaddress" : "92.231.54.234",
           "br_features_pdf" : true,
           "performance_timing_redirectStart" : 0,
           "geo_region" : "TX",
           "page_urlfragment" : "4-conclusion",
           "br_features_flash" : false,
           "web_page_author" : "Fred Blundun",
           "event_format" : "jsonschema",
           "geo_zipcode" : "94109",
           "web_page_datePublished" : "2014-11-06T00:00:00Z",
           "web_page_breadcrumb" : "blog",
           "event_name" : "link_click",
           "page_urlpath" : "/product/index.html",
           "ip_netspeed" : "Cable/DSL",
           "page_title" : "On Analytics",
           "performance_timing_navigationStart" : 1415358089861,
           "ip_organization" : "Bouygues Telecom",
           "performance_timing_domInteractive" : 1415358090886,
           "dvce_created_tstamp" : "2018-07-20T00:03:57.885Z",
           "performance_timing_domComplete" : 0,
           "user_id" : "jon.doe@email.com",
           "performance_timing_unloadEventStart" : 1415358090270,
           "ua_parser_context_useragentVersion" : "IE 7.0",
           "performance_timing_loadEventStart" : 0,
           "performance_timing_domLoading" : 1415358090270,
           "true_tstamp" : "2018-07-23T00:03:57.886Z",
           "geo_longitude" : -122.4124,
           "v_tracker" : "js-2.1.0",
           "link_click_targetUrl" : "http://www.example.com",
           "event_version" : "1-0-0",
           "ua_parser_context_useragentMajor" : "7",
           "domain_sessionid" : "2b15e5c8-d3b1-11e4-b9d6-1681e6b88ec1",
           "performance_timing_connectStart" : 1415358090103,
           "performance_timing_fetchStart" : 1415358089870,
           "domain_userid" : "bc2e92ec6c204a14",
           "page_urlquery" : "id=GTM-DLRG",
           "geo_location" : "37.443604,-122.4124",
           "link_click_elementClasses" : "foreground",
           "link_click_elementId" : "exampleLink",
           "name_tracker" : "cloudfront-1",
           "ua_parser_context_useragentMinor" : "0",
           "web_page_keywords" : "snowplow",
           "performance_timing_domContentLoadedEventStart" : 1415358090968,
           "geo_city" : "New York",
           "web_page_genre" : "blog",
           "derived_tstamp" : "2018-07-22T00:03:57.886Z",
           "app_id" : "angry-birds",
           "ip_isp" : "FDN Communications",
           "ua_parser_context_deviceFamily" : "Other",
           "geo_region_name" : "Florida",
           "ip_domain" : "nuvox.net",
           "performance_timing_connectEnd" : 1415358090183,
           "domain_sessionidx" : 3,
           "page_urlport" : 80,
           "platform" : "web",
           "ua_parser_context_osFamily" : "Windows XP",
           "performance_timing_loadEventEnd" : 0,
           "event_id" : "c6124-b53a-4b13-a233-0088f79dcbcb",
           "performance_timing_redirectEnd" : 0,
           "ua_parser_context_osVersion" : "Windows XP",
           "performance_timing_domainLookupEnd" : 1415358090102,
           "page_url" : "http://www.snowplowanalytics.com",
           "txn_id" : 41828,
           "performance_timing_responseEnd" : 1415358090265,
           "event_fingerprint" : "e3dbfa9cca0412c3d4052863cefb547f",
           "v_etl" : "serde-0.5.2"
         }
      }
    """

  val indicativeEventWithTrimmedAtomicFields = json"""
      {
        "eventName": "link_click",
        "eventUniqueId": "jon.doe@email.com",
        "eventTime": 1532217837886,
        "properties": {
           "page_urlhost" : "www.snowplowanalytics.com",
           "web_page_inLanguage" : "en-US",
           "performance_timing_domContentLoadedEventEnd" : 1415358091309,
           "performance_timing_domainLookupStart" : 1415358090102,
           "performance_timing_unloadEventEnd" : 1415358090287,
           "network_userid" : "ecdff4d0-9175-40ac-a8bb-325c49733607",
           "performance_timing_requestStart" : 1415358090183,
           "geo_country" : "US",
           "performance_timing_responseStart" : 1415358090265,
           "ua_parser_context_useragentFamily" : "IE",
           "user_ipaddress" : "92.231.54.234",
           "performance_timing_redirectStart" : 0,
           "geo_region" : "TX",
           "web_page_author" : "Fred Blundun",
           "geo_zipcode" : "94109",
           "web_page_datePublished" : "2014-11-06T00:00:00Z",
           "web_page_breadcrumb" : "blog",
           "page_urlpath" : "/product/index.html",
           "page_title" : "On Analytics",
           "performance_timing_navigationStart" : 1415358089861,
           "performance_timing_domInteractive" : 1415358090886,
           "performance_timing_domComplete" : 0,
           "user_id" : "jon.doe@email.com",
           "performance_timing_unloadEventStart" : 1415358090270,
           "ua_parser_context_useragentVersion" : "IE 7.0",
           "performance_timing_loadEventStart" : 0,
           "performance_timing_domLoading" : 1415358090270,
           "link_click_targetUrl" : "http://www.example.com",
           "ua_parser_context_useragentMajor" : "7",
           "domain_sessionid" : "2b15e5c8-d3b1-11e4-b9d6-1681e6b88ec1",
           "performance_timing_connectStart" : 1415358090103,
           "performance_timing_fetchStart" : 1415358089870,
           "domain_userid" : "bc2e92ec6c204a14",
           "geo_location" : "37.443604,-122.4124",
           "link_click_elementClasses" : "foreground",
           "link_click_elementId" : "exampleLink",
           "ua_parser_context_useragentMinor" : "0",
           "web_page_keywords" : "snowplow",
           "performance_timing_domContentLoadedEventStart" : 1415358090968,
           "geo_city" : "New York",
           "web_page_genre" : "blog",
           "app_id" : "angry-birds",
           "ua_parser_context_deviceFamily" : "Other",
           "geo_region_name" : "Florida",
           "performance_timing_connectEnd" : 1415358090183,
           "domain_sessionidx" : 3,
           "platform" : "web",
           "ua_parser_context_osFamily" : "Windows XP",
           "performance_timing_loadEventEnd" : 0,
           "event_id" : "c6124-b53a-4b13-a233-0088f79dcbcb",
           "performance_timing_redirectEnd" : 0,
           "ua_parser_context_osVersion" : "Windows XP",
           "performance_timing_domainLookupEnd" : 1415358090102,
           "page_url" : "http://www.snowplowanalytics.com",
           "performance_timing_responseEnd" : 1415358090265
         }
      }
    """

  val indicativeEventWithTrimmedContextFields = json"""
      {
        "eventName": "link_click",
        "eventUniqueId": "jon.doe@email.com",
        "eventTime": 1532217837886,
        "properties": {
           "page_urlhost" : "www.snowplowanalytics.com",
           "etl_tstamp" : "2018-07-20T00:01:25.292Z",
           "geo_latitude" : 37.443604,
           "v_collector" : "clj-tomcat-0.1.0",
           "collector_tstamp" : "2018-07-20T00:02:05Z",
           "event_vendor" : "com.snowplowanalytics.snowplow",
           "network_userid" : "ecdff4d0-9175-40ac-a8bb-325c49733607",
           "geo_country" : "US",
           "user_fingerprint" : "2161814971",
           "page_urlscheme" : "http",
           "event" : "unstruct",
           "user_ipaddress" : "92.231.54.234",
           "br_features_pdf" : true,
           "geo_region" : "TX",
           "page_urlfragment" : "4-conclusion",
           "br_features_flash" : false,
           "event_format" : "jsonschema",
           "geo_zipcode" : "94109",
           "event_name" : "link_click",
           "page_urlpath" : "/product/index.html",
           "ip_netspeed" : "Cable/DSL",
           "page_title" : "On Analytics",
           "ip_organization" : "Bouygues Telecom",
           "dvce_created_tstamp" : "2018-07-20T00:03:57.885Z",
           "user_id" : "jon.doe@email.com",
           "true_tstamp" : "2018-07-23T00:03:57.886Z",
           "geo_longitude" : -122.4124,
           "v_tracker" : "js-2.1.0",
           "link_click_targetUrl" : "http://www.example.com",
           "event_version" : "1-0-0",
           "domain_sessionid" : "2b15e5c8-d3b1-11e4-b9d6-1681e6b88ec1",
           "domain_userid" : "bc2e92ec6c204a14",
           "page_urlquery" : "id=GTM-DLRG",
           "geo_location" : "37.443604,-122.4124",
           "link_click_elementClasses" : "foreground",
           "link_click_elementId" : "exampleLink",
           "name_tracker" : "cloudfront-1",
           "geo_city" : "New York",
           "derived_tstamp" : "2018-07-22T00:03:57.886Z",
           "app_id" : "angry-birds",
           "ip_isp" : "FDN Communications",
           "geo_region_name" : "Florida",
           "ip_domain" : "nuvox.net",
           "domain_sessionidx" : 3,
           "page_urlport" : 80,
           "platform" : "web",
           "event_id" : "c6124-b53a-4b13-a233-0088f79dcbcb",
           "page_url" : "http://www.snowplowanalytics.com",
           "txn_id" : 41828,
           "event_fingerprint" : "e3dbfa9cca0412c3d4052863cefb547f",
           "v_etl" : "serde-0.5.2"
         }
      }
    """

  val mobileIndicativeEvent = json"""{
    "eventName" : "mobile_event",
    "eventUniqueId" : "d1a1abd2-ad91-4427-877b-b5b6a2d59d7a",
    "eventTime" : 1532217837886,
    "properties" : {
      "page_urlhost" : "www.snowplowanalytics.com",
       "etl_tstamp" : "2018-07-20T00:01:25.292Z",
       "client_session_sessionIndex" : 42,
       "geo_latitude" : 37.443604,
       "mobile_context_osVersion" : "5.0.2",
       "v_collector" : "clj-tomcat-0.1.0",
       "collector_tstamp" : "2018-07-20T00:02:05Z",
       "event_vendor" : "com.snowplowanalytics.snowplow",
       "network_userid" : "ecdff4d0-9175-40ac-a8bb-325c49733607",
       "mobile_context_deviceManufacturer" : "samsung",
       "client_session_sessionId" : "5185f442-2e6a-49b8-a6d5-166d6c0bcb44",
       "geo_country" : "US",
       "user_fingerprint" : "2161814971",
       "page_urlscheme" : "http",
       "ua_parser_context_useragentFamily" : "IE",
       "event" : "unstruct",
       "client_session_previousSessionId" : "55c5d879-97c0-3d38-a08e-5bd983cec5da",
       "user_ipaddress" : "92.231.54.234",
       "mobile_context_androidIdfa" : "0aac993c-aaf4-4a6a-a0bc-011f8af28a93",
       "br_features_pdf" : true,
       "geo_region" : "TX",
       "page_urlfragment" : "4-conclusion",
       "br_features_flash" : false,
       "event_format" : "jsonschema",
       "geo_zipcode" : "94109",
       "event_name" : "mobile_event",
       "page_urlpath" : "/product/index.html",
       "ip_netspeed" : "Cable/DSL",
       "page_title" : "On Analytics",
       "ip_organization" : "Bouygues Telecom",
       "dvce_created_tstamp" : "2018-07-20T00:03:57.885Z",
       "ua_parser_context_useragentVersion" : "IE 7.0",
       "true_tstamp" : "2018-07-23T00:03:57.886Z",
       "geo_longitude" : -122.4124,
       "v_tracker" : "js-2.1.0",
       "event_version" : "1-0-0",
       "ua_parser_context_useragentMajor" : "7",
       "client_session_userId" : "d1a1abd2-ad91-4427-877b-b5b6a2d59d7a",
       "domain_sessionid" : "2b15e5c8-d3b1-11e4-b9d6-1681e6b88ec1",
       "mobile_event_id" : "a573776c134a49dc8c7bf5889204747d",
       "page_urlquery" : "id=GTM-DLRG",
       "geo_location" : "37.443604,-122.4124",
       "name_tracker" : "cloudfront-1",
       "ua_parser_context_useragentMinor" : "0",
       "geo_city" : "New York",
       "client_session_firstEventId" : "115a70c9-c173-4961-8973-e266b39f5d8a",
       "derived_tstamp" : "2018-07-22T00:03:57.886Z",
       "client_session_storageMechanism" : "SQLITE",
       "app_id" : "angry-birds",
       "ip_isp" : "FDN Communications",
       "mobile_context_osType" : "android",
       "ua_parser_context_deviceFamily" : "Other",
       "geo_region_name" : "Florida",
       "mobile_context_networkType" : "wifi",
       "ip_domain" : "nuvox.net",
       "domain_sessionidx" : 3,
       "page_urlport" : 80,
       "platform" : "mob",
       "ua_parser_context_osFamily" : "Windows XP",
       "event_id" : "c6124-b53a-4b13-a233-0088f79dcbcb",
       "ua_parser_context_osVersion" : "Windows XP",
       "page_url" : "http://www.snowplowanalytics.com",
       "txn_id" : 41828,
       "mobile_context_deviceModel" : "SM-T530NU",
       "event_fingerprint" : "e3dbfa9cca0412c3d4052863cefb547f",
       "v_etl" : "serde-0.5.2"
    }
  }"""

  val indicativeEventUsingStructuredAction = json"""
      {
        "eventName": "struct link click action",
        "eventUniqueId": "jon.doe@email.com",
        "eventTime": 1532217837886,
        "properties": {
           "page_urlhost" : "www.snowplowanalytics.com",
           "etl_tstamp" : "2018-07-20T00:01:25.292Z",
           "geo_latitude" : 37.443604,
           "v_collector" : "clj-tomcat-0.1.0",
           "collector_tstamp" : "2018-07-20T00:02:05Z",
           "event_vendor" : "com.snowplowanalytics.snowplow",
           "network_userid" : "ecdff4d0-9175-40ac-a8bb-325c49733607",
           "geo_country" : "US",
           "user_fingerprint" : "2161814971",
           "page_urlscheme" : "http",
           "event" : "unstruct",
           "user_ipaddress" : "92.231.54.234",
           "br_features_pdf" : true,
           "geo_region" : "TX",
           "page_urlfragment" : "4-conclusion",
           "br_features_flash" : false,
           "event_format" : "jsonschema",
           "geo_zipcode" : "94109",
           "event_name" : "event",
           "page_urlpath" : "/product/index.html",
           "ip_netspeed" : "Cable/DSL",
           "page_title" : "On Analytics",
           "ip_organization" : "Bouygues Telecom",
           "dvce_created_tstamp" : "2018-07-20T00:03:57.885Z",
           "se_action" : "struct link click action",
           "se_category" : "struct link click category",
           "user_id" : "jon.doe@email.com",
           "true_tstamp" : "2018-07-23T00:03:57.886Z",
           "geo_longitude" : -122.4124,
           "v_tracker" : "js-2.1.0",
           "link_click_targetUrl" : "http://www.example.com",
           "event_version" : "1-0-0",
           "domain_sessionid" : "2b15e5c8-d3b1-11e4-b9d6-1681e6b88ec1",
           "domain_userid" : "bc2e92ec6c204a14",
           "page_urlquery" : "id=GTM-DLRG",
           "geo_location" : "37.443604,-122.4124",
           "link_click_elementClasses" : "foreground",
           "link_click_elementId" : "exampleLink",
           "name_tracker" : "cloudfront-1",
           "geo_city" : "New York",
           "derived_tstamp" : "2018-07-22T00:03:57.886Z",
           "app_id" : "angry-birds",
           "ip_isp" : "FDN Communications",
           "geo_region_name" : "Florida",
           "ip_domain" : "nuvox.net",
           "domain_sessionidx" : 3,
           "page_urlport" : 80,
           "platform" : "web",
           "event_id" : "c6124-b53a-4b13-a233-0088f79dcbcb",
           "page_url" : "http://www.snowplowanalytics.com",
           "txn_id" : 41828,
           "event_fingerprint" : "e3dbfa9cca0412c3d4052863cefb547f",
           "v_etl" : "serde-0.5.2"
         }
      }
    """

  val indicativeEventUsingStructuredCategory = json"""
      {
        "eventName": "struct link click category",
        "eventUniqueId": "jon.doe@email.com",
        "eventTime": 1532217837886,
        "properties": {
           "page_urlhost" : "www.snowplowanalytics.com",
           "etl_tstamp" : "2018-07-20T00:01:25.292Z",
           "geo_latitude" : 37.443604,
           "v_collector" : "clj-tomcat-0.1.0",
           "collector_tstamp" : "2018-07-20T00:02:05Z",
           "event_vendor" : "com.snowplowanalytics.snowplow",
           "network_userid" : "ecdff4d0-9175-40ac-a8bb-325c49733607",
           "geo_country" : "US",
           "user_fingerprint" : "2161814971",
           "page_urlscheme" : "http",
           "event" : "unstruct",
           "user_ipaddress" : "92.231.54.234",
           "br_features_pdf" : true,
           "geo_region" : "TX",
           "page_urlfragment" : "4-conclusion",
           "br_features_flash" : false,
           "event_format" : "jsonschema",
           "geo_zipcode" : "94109",
           "event_name" : "event",
           "page_urlpath" : "/product/index.html",
           "ip_netspeed" : "Cable/DSL",
           "page_title" : "On Analytics",
           "ip_organization" : "Bouygues Telecom",
           "dvce_created_tstamp" : "2018-07-20T00:03:57.885Z",
           "se_action" : "struct link click action",
           "se_category" : "struct link click category",
           "user_id" : "jon.doe@email.com",
           "true_tstamp" : "2018-07-23T00:03:57.886Z",
           "geo_longitude" : -122.4124,
           "v_tracker" : "js-2.1.0",
           "link_click_targetUrl" : "http://www.example.com",
           "event_version" : "1-0-0",
           "domain_sessionid" : "2b15e5c8-d3b1-11e4-b9d6-1681e6b88ec1",
           "domain_userid" : "bc2e92ec6c204a14",
           "page_urlquery" : "id=GTM-DLRG",
           "geo_location" : "37.443604,-122.4124",
           "link_click_elementClasses" : "foreground",
           "link_click_elementId" : "exampleLink",
           "name_tracker" : "cloudfront-1",
           "geo_city" : "New York",
           "derived_tstamp" : "2018-07-22T00:03:57.886Z",
           "app_id" : "angry-birds",
           "ip_isp" : "FDN Communications",
           "geo_region_name" : "Florida",
           "ip_domain" : "nuvox.net",
           "domain_sessionidx" : 3,
           "page_urlport" : 80,
           "platform" : "web",
           "event_id" : "c6124-b53a-4b13-a233-0088f79dcbcb",
           "page_url" : "http://www.snowplowanalytics.com",
           "txn_id" : 41828,
           "event_fingerprint" : "e3dbfa9cca0412c3d4052863cefb547f",
           "v_etl" : "serde-0.5.2"
         }
      }
    """

  val userId              = "jon.doe@email.com"
  val clientSessionUserId = "d1a1abd2-ad91-4427-877b-b5b6a2d59d7a"
  val domainUserid        = "bc2e92ec6c204a14"

  val seAction   = "struct link click action"
  val seCategory = "struct link click category"
  val eventName  = "link_click"

}
