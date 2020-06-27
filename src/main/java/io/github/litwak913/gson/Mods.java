
package io.github.litwak913.gson;
import java.util.List;
import java.util.Date;


public class Mods {

    private int id;
    private String name;
    private List<Authors> authors;
    private List<Attachments> attachments;
    private String websiteUrl;
    private int gameId;
    private String summary;
    private long defaultFileId;
    private long downloadCount;
    private List<LatestFiles> latestFiles;
    private List<Categories> categories;
    private int status;
    private int primaryCategoryId;
    private CategorySection categorySection;
    private String slug;
    private List<GameVersionLatestFiles> gameVersionLatestFiles;
    private boolean isFeatured;
    private double popularityScore;
    private int gamePopularityRank;
    private String primaryLanguage;
    private String gameSlug;
    private String gameName;
    private String portalName;
    private Date dateModified;
    private Date dateCreated;
    private Date dateReleased;
    private boolean isAvailable;
    private boolean isExperiemental;
    public void setId(int id) {
         this.id = id;
     }
     public int getId() {
         return id;
     }

    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setAuthors(List<Authors> authors) {
         this.authors = authors;
     }
     public List<Authors> getAuthors() {
         return authors;
     }

    public void setAttachments(List<Attachments> attachments) {
         this.attachments = attachments;
     }
     public List<Attachments> getAttachments() {
         return attachments;
     }

    public void setWebsiteUrl(String websiteUrl) {
         this.websiteUrl = websiteUrl;
     }
     public String getWebsiteUrl() {
         return websiteUrl;
     }

    public void setGameId(int gameId) {
         this.gameId = gameId;
     }
     public int getGameId() {
         return gameId;
     }

    public void setSummary(String summary) {
         this.summary = summary;
     }
     public String getSummary() {
         return summary;
     }

    public void setDefaultFileId(long defaultFileId) {
         this.defaultFileId = defaultFileId;
     }
     public long getDefaultFileId() {
         return defaultFileId;
     }

    public void setDownloadCount(long downloadCount) {
         this.downloadCount = downloadCount;
     }
     public long getDownloadCount() {
         return downloadCount;
     }

    public void setLatestFiles(List<LatestFiles> latestFiles) {
         this.latestFiles = latestFiles;
     }
     public List<LatestFiles> getLatestFiles() {
         return latestFiles;
     }

    public void setCategories(List<Categories> categories) {
         this.categories = categories;
     }
     public List<Categories> getCategories() {
         return categories;
     }

    public void setStatus(int status) {
         this.status = status;
     }
     public int getStatus() {
         return status;
     }

    public void setPrimaryCategoryId(int primaryCategoryId) {
         this.primaryCategoryId = primaryCategoryId;
     }
     public int getPrimaryCategoryId() {
         return primaryCategoryId;
     }

    public void setCategorySection(CategorySection categorySection) {
         this.categorySection = categorySection;
     }
     public CategorySection getCategorySection() {
         return categorySection;
     }

    public void setSlug(String slug) {
         this.slug = slug;
     }
     public String getSlug() {
         return slug;
     }

    public void setGameVersionLatestFiles(List<GameVersionLatestFiles> gameVersionLatestFiles) {
         this.gameVersionLatestFiles = gameVersionLatestFiles;
     }
     public List<GameVersionLatestFiles> getGameVersionLatestFiles() {
         return gameVersionLatestFiles;
     }

    public void setIsFeatured(boolean isFeatured) {
         this.isFeatured = isFeatured;
     }
     public boolean getIsFeatured() {
         return isFeatured;
     }

    public void setPopularityScore(double popularityScore) {
         this.popularityScore = popularityScore;
     }
     public double getPopularityScore() {
         return popularityScore;
     }

    public void setGamePopularityRank(int gamePopularityRank) {
         this.gamePopularityRank = gamePopularityRank;
     }
     public int getGamePopularityRank() {
         return gamePopularityRank;
     }

    public void setPrimaryLanguage(String primaryLanguage) {
         this.primaryLanguage = primaryLanguage;
     }
     public String getPrimaryLanguage() {
         return primaryLanguage;
     }

    public void setGameSlug(String gameSlug) {
         this.gameSlug = gameSlug;
     }
     public String getGameSlug() {
         return gameSlug;
     }

    public void setGameName(String gameName) {
         this.gameName = gameName;
     }
     public String getGameName() {
         return gameName;
     }

    public void setPortalName(String portalName) {
         this.portalName = portalName;
     }
     public String getPortalName() {
         return portalName;
     }

    public void setDateModified(Date dateModified) {
         this.dateModified = dateModified;
     }
     public Date getDateModified() {
         return dateModified;
     }

    public void setDateCreated(Date dateCreated) {
         this.dateCreated = dateCreated;
     }
     public Date getDateCreated() {
         return dateCreated;
     }

    public void setDateReleased(Date dateReleased) {
         this.dateReleased = dateReleased;
     }
     public Date getDateReleased() {
         return dateReleased;
     }

    public void setIsAvailable(boolean isAvailable) {
         this.isAvailable = isAvailable;
     }
     public boolean getIsAvailable() {
         return isAvailable;
     }

    public void setIsExperiemental(boolean isExperiemental) {
         this.isExperiemental = isExperiemental;
     }
     public boolean getIsExperiemental() {
         return isExperiemental;
     }

}