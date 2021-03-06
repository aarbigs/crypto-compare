package crypto.model.coinList;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by daniel on 06.09.17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Coin {
    String id; //"4321",
    String url; //"/coins/42/overview",
    String imageUrl; //"/media/19984/42.png",
    String name; //"42",
    String coinName; //"42 CoinPojo",
    String fullName; //"42 CoinPojo (42)",
    String algorithm; //"Scrypt",
    String proofType; //"PoW",
    String fullyPremined; //"0",
    String totalCoinSupply; //"42",
    String preMinedValue; //"N/A",
    String totalCoinsFreeFloat; //"N/A",
    String sortOrder; //"34"

    String symbol;
    String coin_name;
    String coin_id;
    String image_url;
    String following;

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getCoin_name() {
        return coin_name;
    }

    public void setCoin_name(String coin_name) {
        this.coin_name = coin_name;
    }

    public String getCoin_id() {
        return coin_id;
    }

    public void setCoin_id(String coin_id) {
        this.coin_id = coin_id;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getFollowing() {
        return following;
    }

    public void setFollowing(String following) {
        this.following = following;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCoinName() {
        return coinName;
    }

    public void setCoinName(String coinName) {
        this.coinName = coinName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAlgorithm() {
        return algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public String getProofType() {
        return proofType;
    }

    public void setProofType(String proofType) {
        this.proofType = proofType;
    }

    public String getFullyPremined() {
        return fullyPremined;
    }

    public void setFullyPremined(String fullyPremined) {
        this.fullyPremined = fullyPremined;
    }

    public String getTotalCoinSupply() {
        return totalCoinSupply;
    }

    public void setTotalCoinSupply(String totalCoinSupply) {
        this.totalCoinSupply = totalCoinSupply;
    }

    public String getPreMinedValue() {
        return preMinedValue;
    }

    public void setPreMinedValue(String preMinedValue) {
        this.preMinedValue = preMinedValue;
    }

    public String getTotalCoinsFreeFloat() {
        return totalCoinsFreeFloat;
    }

    public void setTotalCoinsFreeFloat(String ttalCoinsFreeFloat) {
        this.totalCoinsFreeFloat = ttalCoinsFreeFloat;
    }

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }
}
