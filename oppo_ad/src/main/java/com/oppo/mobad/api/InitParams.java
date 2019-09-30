package com.oppo.mobad.api;

public class InitParams {
    public InitParams(InitParams.Builder var){

    }
    public static class Builder{
        public Builder(){}
        public InitParams.Builder setLog(boolean b){
            return this;
        }
        public InitParams.Builder setDebug(boolean b){
            return this;
        }
        public InitParams build(){
            return new InitParams(this);
        }
    }
}
