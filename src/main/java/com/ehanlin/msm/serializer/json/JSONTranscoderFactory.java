package com.ehanlin.msm.serializer.json;

import de.javakaffee.web.msm.MemcachedSessionService.SessionManager;
import de.javakaffee.web.msm.SessionAttributesTranscoder;
import de.javakaffee.web.msm.TranscoderFactory;

public class JSONTranscoderFactory implements TranscoderFactory{

    private JSONTranscoder transcoder = new JSONTranscoder();
    
    @Override
    public SessionAttributesTranscoder createTranscoder(SessionManager arg0) {
        return transcoder;
    }

    @Override
    public void setCopyCollectionsForSerialization(boolean arg0) {
        
    }

    @Override
    public void setCustomConverterClassNames(String[] arg0) {
        
    }

}
