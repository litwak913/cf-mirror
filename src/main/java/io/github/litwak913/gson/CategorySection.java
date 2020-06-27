
package io.github.litwak913.gson;

public class CategorySection {

    private int id;
    private int gameId;
    private String name;
    private int packageType;
    private String path;
    private String initialInclusionPattern;
    private String extraIncludePattern;
    private int gameCategoryId;
    public void setId(int id) {
         this.id = id;
     }
     public int getId() {
         return id;
     }

    public void setGameId(int gameId) {
         this.gameId = gameId;
     }
     public int getGameId() {
         return gameId;
     }

    public void setName(String name) {
         this.name = name;
     }
     public String getName() {
         return name;
     }

    public void setPackageType(int packageType) {
         this.packageType = packageType;
     }
     public int getPackageType() {
         return packageType;
     }

    public void setPath(String path) {
         this.path = path;
     }
     public String getPath() {
         return path;
     }

    public void setInitialInclusionPattern(String initialInclusionPattern) {
         this.initialInclusionPattern = initialInclusionPattern;
     }
     public String getInitialInclusionPattern() {
         return initialInclusionPattern;
     }

    public void setExtraIncludePattern(String extraIncludePattern) {
         this.extraIncludePattern = extraIncludePattern;
     }
     public String getExtraIncludePattern() {
         return extraIncludePattern;
     }

    public void setGameCategoryId(int gameCategoryId) {
         this.gameCategoryId = gameCategoryId;
     }
     public int getGameCategoryId() {
         return gameCategoryId;
     }

}