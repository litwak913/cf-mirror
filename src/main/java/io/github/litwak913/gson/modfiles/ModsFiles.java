
package io.github.litwak913.gson.modfiles;
import io.github.litwak913.gson.modfiles.Modules;

import java.util.Date;
import java.util.List;


public class ModsFiles {

    private long id;
    private String displayName;
    private String fileName;
    private Date fileDate;
    private int fileLength;
    private int releaseType;
    private int fileStatus;
    private String downloadUrl;
    private boolean isAlternate;
    private long alternateFileId;
    private List<String> dependencies;
    private boolean isAvailable;
    private List<Modules> modules;
    private long packageFingerprint;
    private List<String> gameVersion;
    private String installMetadata;
    private String serverPackFileId;
    private boolean hasInstallScript;
    private Date gameVersionDateReleased;
    private String gameVersionFlavor;
    public void setId(long id) {
         this.id = id;
     }
     public long getId() {
         return id;
     }

    public void setDisplayName(String displayName) {
         this.displayName = displayName;
     }
     public String getDisplayName() {
         return displayName;
     }

    public void setFileName(String fileName) {
         this.fileName = fileName;
     }
     public String getFileName() {
         return fileName;
     }

    public void setFileDate(Date fileDate) {
         this.fileDate = fileDate;
     }
     public Date getFileDate() {
         return fileDate;
     }

    public void setFileLength(int fileLength) {
         this.fileLength = fileLength;
     }
     public int getFileLength() {
         return fileLength;
     }

    public void setReleaseType(int releaseType) {
         this.releaseType = releaseType;
     }
     public int getReleaseType() {
         return releaseType;
     }

    public void setFileStatus(int fileStatus) {
         this.fileStatus = fileStatus;
     }
     public int getFileStatus() {
         return fileStatus;
     }

    public void setDownloadUrl(String downloadUrl) {
         this.downloadUrl = downloadUrl;
     }
     public String getDownloadUrl() {
         return downloadUrl;
     }

    public void setIsAlternate(boolean isAlternate) {
         this.isAlternate = isAlternate;
     }
     public boolean getIsAlternate() {
         return isAlternate;
     }

    public void setAlternateFileId(long alternateFileId) {
         this.alternateFileId = alternateFileId;
     }
     public long getAlternateFileId() {
         return alternateFileId;
     }

    public void setDependencies(List<String> dependencies) {
         this.dependencies = dependencies;
     }
     public List<String> getDependencies() {
         return dependencies;
     }

    public void setIsAvailable(boolean isAvailable) {
         this.isAvailable = isAvailable;
     }
     public boolean getIsAvailable() {
         return isAvailable;
     }

    public void setModules(List<Modules> modules) {
         this.modules = modules;
     }
     public List<Modules> getModules() {
         return modules;
     }

    public void setPackageFingerprint(long packageFingerprint) {
         this.packageFingerprint = packageFingerprint;
     }
     public long getPackageFingerprint() {
         return packageFingerprint;
     }

    public void setGameVersion(List<String> gameVersion) {
         this.gameVersion = gameVersion;
     }
     public List<String> getGameVersion() {
         return gameVersion;
     }

    public void setInstallMetadata(String installMetadata) {
         this.installMetadata = installMetadata;
     }
     public String getInstallMetadata() {
         return installMetadata;
     }

    public void setServerPackFileId(String serverPackFileId) {
         this.serverPackFileId = serverPackFileId;
     }
     public String getServerPackFileId() {
         return serverPackFileId;
     }

    public void setHasInstallScript(boolean hasInstallScript) {
         this.hasInstallScript = hasInstallScript;
     }
     public boolean getHasInstallScript() {
         return hasInstallScript;
     }

    public void setGameVersionDateReleased(Date gameVersionDateReleased) {
         this.gameVersionDateReleased = gameVersionDateReleased;
     }
     public Date getGameVersionDateReleased() {
         return gameVersionDateReleased;
     }

    public void setGameVersionFlavor(String gameVersionFlavor) {
         this.gameVersionFlavor = gameVersionFlavor;
     }
     public String getGameVersionFlavor() {
         return gameVersionFlavor;
     }

}