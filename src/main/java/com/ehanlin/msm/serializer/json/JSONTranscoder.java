package com.ehanlin.msm.serializer.json;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;

import de.javakaffee.web.msm.MemcachedBackupSession;
import de.javakaffee.web.msm.SessionAttributesTranscoder;

public class JSONTranscoder implements SessionAttributesTranscoder {
        
    @Override
    public Map<String, Object> deserializeAttributes(byte[] arg0) {
        try {
            return  JSON.parseObject(new String(arg0, "UTF-8"), new TypeReference<Map<String, Object>>(){});
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException();
        }
    }

    @Override
    public byte[] serializeAttributes(MemcachedBackupSession arg0, Map<String, Object> arg1) {
        try(ByteArrayOutputStream bos = new ByteArrayOutputStream()){
            return JSON.toJSONString(arg1).getBytes("UTF-8");
        }catch(Exception ex){
            throw new IllegalArgumentException();
        }
    }

}
