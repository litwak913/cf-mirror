
package io.github.litwak913.gson;

public class Modules {

    private String foldername;
    private long fingerprint;
    private int type;
    public void setFoldername(String foldername) {
         this.foldername = foldername;
     }
     public String getFoldername() {
         return foldername;
     }

    public void setFingerprint(long fingerprint) {
         this.fingerprint = fingerprint;
     }
     public long getFingerprint() {
         return fingerprint;
     }

    public void setType(int type) {
         this.type = type;
     }
     public int getType() {
         return type;
     }

}