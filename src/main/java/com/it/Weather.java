package com.it;

public class Weather {
    String[] positions;
    int[] datas[];
    public String reporting(String[] positions,int[] datas[]){
        //假设data  12
        int max = datas[0][0];
        int maxindex= 0;
        for(int i= 0 ; i < datas.length;i++ ){
            for(int j = 0; j< datas.length;j++){
                if(datas[i][j]>max){
                    max = datas[i][j];
                    maxindex = i;
                }
            }
        }
        return positions[maxindex];
    }
}
