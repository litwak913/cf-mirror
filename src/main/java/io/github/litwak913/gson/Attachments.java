
package io.github.litwak913.gson;


public class Attachments {

    private int id;
    private int projectId;
    private String description;
    private boolean isDefault;
    private String thumbnailUrl;
    private String title;
    private String url;
    private int status;
    public void setId(int id) {
         this.id = id;
     }
     public int getId() {
         return id;
     }

    public void setProjectId(int projectId) {
         this.projectId = projectId;
     }
     public int getProjectId() {
         return projectId;
     }

    public void setDescription(String description) {
         this.description = description;
     }
     public String getDescription() {
         return description;
     }

    public void setIsDefault(boolean isDefault) {
         this.isDefault = isDefault;
     }
     public boolean getIsDefault() {
         return isDefault;
     }

    public void setThumbnailUrl(String thumbnailUrl) {
         this.thumbnailUrl = thumbnailUrl;
     }
     public String getThumbnailUrl() {
         return thumbnailUrl;
     }

    public void setTitle(String title) {
         this.title = title;
     }
     public String getTitle() {
         return title;
     }

    public void setUrl(String url) {
         this.url = url;
     }
     public String getUrl() {
         return url;
     }

    public void setStatus(int status) {
         this.status = status;
     }
     public int getStatus() {
         return status;
     }

}