package com.xiaofu.sharding.algorithm;


import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingAlgorithm;
import org.apache.shardingsphere.api.sharding.complex.ComplexKeysShardingValue;

import java.util.Collection;


public class MyComplexKeysShardingAlgorithm implements ComplexKeysShardingAlgorithm<Long> {

    @Override
    public Collection<String> doSharding(Collection<String> collection, ComplexKeysShardingValue<Long> complexKeysShardingValue) {

//        Collection<Integer> ids = getShardingValue(shardingValues, "id");
//        Collection<Integer> usernames = getShardingValue(shardingValues, "username");
        return null;
    }
}

