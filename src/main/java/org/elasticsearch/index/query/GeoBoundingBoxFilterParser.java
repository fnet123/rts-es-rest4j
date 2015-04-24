/*
 * Licensed to Elasticsearch under one or more contributor
 * license agreements. See the NOTICE file distributed with
 * this work for additional information regarding copyright
 * ownership. Elasticsearch licenses this file to you under
 * the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.elasticsearch.index.query;

/**
 *
 */
public class GeoBoundingBoxFilterParser {

    public static final String TOP = "top";
    public static final String LEFT = "left";
    public static final String RIGHT = "right";
    public static final String BOTTOM = "bottom";

    public static final String TOP_LEFT = TOP + "_" + LEFT;
    public static final String TOP_RIGHT = TOP + "_" + RIGHT;
    public static final String BOTTOM_LEFT = BOTTOM + "_" + LEFT;
    public static final String BOTTOM_RIGHT = BOTTOM + "_" + RIGHT;

    public static final String TOPLEFT = "topLeft";
    public static final String TOPRIGHT = "topRight";
    public static final String BOTTOMLEFT = "bottomLeft";
    public static final String BOTTOMRIGHT = "bottomRight";

    public static final String NAME = "geo_bbox";
    public static final String FIELD = "field";

}
