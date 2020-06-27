
package io.github.litwak913.gson;
import java.util.Date;


public class GameVersionLatestFiles {

    private Date gameVersion;
    private long projectFileId;
    private String projectFileName;
    private int fileType;
    private String gameVersionFlavor;
    public void setGameVersion(Date gameVersion) {
         this.gameVersion = gameVersion;
     }
     public Date getGameVersion() {
         return gameVersion;
     }

    public void setProjectFileId(long projectFileId) {
         this.projectFileId = projectFileId;
     }
     public long getProjectFileId() {
         return projectFileId;
     }

    public void setProjectFileName(String projectFileName) {
         this.projectFileName = projectFileName;
     }
     public String getProjectFileName() {
         return projectFileName;
     }

    public void setFileType(int fileType) {
         this.fileType = fileType;
     }
     public int getFileType() {
         return fileType;
     }

    public void setGameVersionFlavor(String gameVersionFlavor) {
         this.gameVersionFlavor = gameVersionFlavor;
     }
     public String getGameVersionFlavor() {
         return gameVersionFlavor;
     }

}