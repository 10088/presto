/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.facebook.presto.spark.adaptive.execution;

import com.facebook.presto.Session;
import com.facebook.presto.spark.TestPrestoSparkAggregations;

import static com.facebook.presto.spark.PrestoSparkSessionProperties.SPARK_ADAPTIVE_QUERY_EXECUTION_ENABLED;

public class TestPrestoSparkAdaptiveAggregations
        extends TestPrestoSparkAggregations
{
    @Override
    public void testAggregationPushedBelowOuterJoin()
    {
        // TODO Fix test (issue #18969).
    }

    @Override
    public void testSingleDistinctOptimizer()
    {
        // TODO Fix test (issue #18969).
    }

    @Override
    protected Session getSession()
    {
        return Session.builder(super.getSession())
                .setSystemProperty(SPARK_ADAPTIVE_QUERY_EXECUTION_ENABLED, "true")
                .build();
    }
}
