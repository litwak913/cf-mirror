
package io.github.litwak913.gson.modfiles;


public class Modules {

    private String foldername;
    private long fingerprint;
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

}