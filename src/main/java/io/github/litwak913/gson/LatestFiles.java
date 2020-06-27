
package io.github.litwak913.gson;
import io.github.litwak913.gson.Modules;
import io.github.litwak913.gson.SortableGameVersion;

import java.util.Date;
import java.util.List;

public class LatestFiles {

    private long id;
    private String displayName;
    private String fileName;
    private Date fileDate;
    private int fileLength;
    private int releaseType;
    private int fileStatus;
    private String downloadUrl;
    private boolean isAlternate;
    private int alternateFileId;
    private List<String> dependencies;
    private boolean isAvailable;
    private List<io.github.litwak913.gson.Modules> modules;
    private long packageFingerprint;
    private List<Date> gameVersion;
    private List<io.github.litwak913.gson.SortableGameVersion> sortableGameVersion;
    private String installMetadata;
    private String changelog;
    private boolean hasInstallScript;
    private boolean isCompatibleWithClient;
    private int categorySectionPackageType;
    private int restrictProjectFileAccess;
    private int projectStatus;
    private long renderCacheId;
    private String fileLegacyMappingId;
    private int projectId;
    private String parentProjectFileId;
    private String parentFileLegacyMappingId;
    private String fileTypeId;
    private String exposeAsAlternative;
    private long packageFingerprintId;
    private Date gameVersionDateReleased;
    private long gameVersionMappingId;
    private int gameVersionId;
    private int gameId;
    private boolean isServerPack;
    private String serverPackFileId;
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

    public void setAlternateFileId(int alternateFileId) {
         this.alternateFileId = alternateFileId;
     }
     public int getAlternateFileId() {
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

    public void setGameVersion(List<Date> gameVersion) {
         this.gameVersion = gameVersion;
     }
     public List<Date> getGameVersion() {
         return gameVersion;
     }

    public void setSortableGameVersion(List<SortableGameVersion> sortableGameVersion) {
         this.sortableGameVersion = sortableGameVersion;
     }
     public List<SortableGameVersion> getSortableGameVersion() {
         return sortableGameVersion;
     }

    public void setInstallMetadata(String installMetadata) {
         this.installMetadata = installMetadata;
     }
     public String getInstallMetadata() {
         return installMetadata;
     }

    public void setChangelog(String changelog) {
         this.changelog = changelog;
     }
     public String getChangelog() {
         return changelog;
     }

    public void setHasInstallScript(boolean hasInstallScript) {
         this.hasInstallScript = hasInstallScript;
     }
     public boolean getHasInstallScript() {
         return hasInstallScript;
     }

    public void setIsCompatibleWithClient(boolean isCompatibleWithClient) {
         this.isCompatibleWithClient = isCompatibleWithClient;
     }
     public boolean getIsCompatibleWithClient() {
         return isCompatibleWithClient;
     }

    public void setCategorySectionPackageType(int categorySectionPackageType) {
         this.categorySectionPackageType = categorySectionPackageType;
     }
     public int getCategorySectionPackageType() {
         return categorySectionPackageType;
     }

    public void setRestrictProjectFileAccess(int restrictProjectFileAccess) {
         this.restrictProjectFileAccess = restrictProjectFileAccess;
     }
     public int getRestrictProjectFileAccess() {
         return restrictProjectFileAccess;
     }

    public void setProjectStatus(int projectStatus) {
         this.projectStatus = projectStatus;
     }
     public int getProjectStatus() {
         return projectStatus;
     }

    public void setRenderCacheId(long renderCacheId) {
         this.renderCacheId = renderCacheId;
     }
     public long getRenderCacheId() {
         return renderCacheId;
     }

    public void setFileLegacyMappingId(String fileLegacyMappingId) {
         this.fileLegacyMappingId = fileLegacyMappingId;
     }
     public String getFileLegacyMappingId() {
         return fileLegacyMappingId;
     }

    public void setProjectId(int projectId) {
         this.projectId = projectId;
     }
     public int getProjectId() {
         return projectId;
     }

    public void setParentProjectFileId(String parentProjectFileId) {
         this.parentProjectFileId = parentProjectFileId;
     }
     public String getParentProjectFileId() {
         return parentProjectFileId;
     }

    public void setParentFileLegacyMappingId(String parentFileLegacyMappingId) {
         this.parentFileLegacyMappingId = parentFileLegacyMappingId;
     }
     public String getParentFileLegacyMappingId() {
         return parentFileLegacyMappingId;
     }

    public void setFileTypeId(String fileTypeId) {
         this.fileTypeId = fileTypeId;
     }
     public String getFileTypeId() {
         return fileTypeId;
     }

    public void setExposeAsAlternative(String exposeAsAlternative) {
         this.exposeAsAlternative = exposeAsAlternative;
     }
     public String getExposeAsAlternative() {
         return exposeAsAlternative;
     }

    public void setPackageFingerprintId(long packageFingerprintId) {
         this.packageFingerprintId = packageFingerprintId;
     }
     public long getPackageFingerprintId() {
         return packageFingerprintId;
     }

    public void setGameVersionDateReleased(Date gameVersionDateReleased) {
         this.gameVersionDateReleased = gameVersionDateReleased;
     }
     public Date getGameVersionDateReleased() {
         return gameVersionDateReleased;
     }

    public void setGameVersionMappingId(long gameVersionMappingId) {
         this.gameVersionMappingId = gameVersionMappingId;
     }
     public long getGameVersionMappingId() {
         return gameVersionMappingId;
     }

    public void setGameVersionId(int gameVersionId) {
         this.gameVersionId = gameVersionId;
     }
     public int getGameVersionId() {
         return gameVersionId;
     }

    public void setGameId(int gameId) {
         this.gameId = gameId;
     }
     public int getGameId() {
         return gameId;
     }

    public void setIsServerPack(boolean isServerPack) {
         this.isServerPack = isServerPack;
     }
     public boolean getIsServerPack() {
         return isServerPack;
     }

    public void setServerPackFileId(String serverPackFileId) {
         this.serverPackFileId = serverPackFileId;
     }
     public String getServerPackFileId() {
         return serverPackFileId;
     }

    public void setGameVersionFlavor(String gameVersionFlavor) {
         this.gameVersionFlavor = gameVersionFlavor;
     }
     public String getGameVersionFlavor() {
         return gameVersionFlavor;
     }

}