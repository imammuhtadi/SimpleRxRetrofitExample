package com.imammuhtadi.simplerxretrofitexample.model;

public class Result {

    private int generatorID;
    private String displayName;
    private String urlName;
    private int totalVotesScore;
    private String imageUrl;
    private int instancesCount;
    private int ranking;

    /**
     *
     * @return
     * The generatorID
     */
    public int getGeneratorID() {
        return generatorID;
    }

    /**
     *
     * @param generatorID
     * The generatorID
     */
    public void setGeneratorID(int generatorID) {
        this.generatorID = generatorID;
    }

    /**
     *
     * @return
     * The displayName
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     *
     * @param displayName
     * The displayName
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     *
     * @return
     * The urlName
     */
    public String getUrlName() {
        return urlName;
    }

    /**
     *
     * @param urlName
     * The urlName
     */
    public void setUrlName(String urlName) {
        this.urlName = urlName;
    }

    /**
     *
     * @return
     * The totalVotesScore
     */
    public int getTotalVotesScore() {
        return totalVotesScore;
    }

    /**
     *
     * @param totalVotesScore
     * The totalVotesScore
     */
    public void setTotalVotesScore(int totalVotesScore) {
        this.totalVotesScore = totalVotesScore;
    }

    /**
     *
     * @return
     * The imageUrl
     */
    public String getImageUrl() {
        return imageUrl;
    }

    /**
     *
     * @param imageUrl
     * The imageUrl
     */
    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    /**
     *
     * @return
     * The instancesCount
     */
    public int getInstancesCount() {
        return instancesCount;
    }

    /**
     *
     * @param instancesCount
     * The instancesCount
     */
    public void setInstancesCount(int instancesCount) {
        this.instancesCount = instancesCount;
    }

    /**
     *
     * @return
     * The ranking
     */
    public int getRanking() {
        return ranking;
    }

    /**
     *
     * @param ranking
     * The ranking
     */
    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

}