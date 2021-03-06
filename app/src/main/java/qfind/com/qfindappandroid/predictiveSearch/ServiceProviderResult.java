package qfind.com.qfindappandroid.predictiveSearch;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;


public class ServiceProviderResult {
    @SerializedName("service_provider_name")
    private String serviceProviderName;
    @SerializedName("service_provider_address")
    private String serviceProviderAddress;
    @SerializedName("service_provider_location")
    private String serviceProviderLocation;
    @SerializedName("service_provider_category")
    private String serviceProviderCategory;
    @SerializedName("service_provider_name_arabic")
    private String serviceProviderNameArabic;
    @SerializedName("service_provider_address_arabic")
    private String serviceProviderAddressArabic;
    @SerializedName("service_provider_location_arabic")
    private String serviceProviderLocationArabic;
    @SerializedName("service_provider_category_arabic")
    private String serviceProviderCategoryArabic;
    @SerializedName("id")
    private int serviceProviderId;
    @SerializedName("service_provider_mail_account")
    private String serviceProviderMail;
    @SerializedName("service_provider_website")
    private String serviceProviderWebsite;
    @SerializedName("service_provider_mobile_number")
    private String serviceProviderMobile;
    @SerializedName("service_provider_map_location")
    private String serviceProviderMapLocation;
    @SerializedName("service_provider_facebook_page")
    private String serviceProviderFacebook;
    @SerializedName("service_provider_linkdin_page")
    private String serviceProviderLinkedin;
    @SerializedName("service_provider_instagram_page")
    private String serviceProviderInstagram;
    @SerializedName("service_provider_twitter_page")
    private String serviceProviderTwitter;
    @SerializedName("service_provider_snapchat_page")
    private String serviceProviderSnapchat;
    @SerializedName("service_provider_googleplus_page")
    private String serviceProviderGoogleplus;
    @SerializedName("service_provider_logo")
    private String serviceProviderLogo;
    @SerializedName("message")
    private String message;
    @SerializedName("service_provider_time")
    ArrayList<ServiceProviderTimeList> serviceProviderTimeLists;



    public String getServiceProviderName() {
        return serviceProviderName;
    }

    public void setServiceProviderName(String serviceProviderName) {
        this.serviceProviderName = serviceProviderName;
    }

    public String getServiceProviderAddress() {
        return serviceProviderAddress;
    }

    public void setServiceProviderAddress(String serviceProviderAddress) {
        this.serviceProviderAddress = serviceProviderAddress;
    }

    public String getServiceProviderLocation() {
        return serviceProviderLocation;
    }

    public void setServiceProviderLocation(String serviceProviderLocation) {
        this.serviceProviderLocation = serviceProviderLocation;
    }

    public String getServiceProviderNameArabic() {
        return serviceProviderNameArabic;
    }

    public void setServiceProviderNameArabic(String serviceProviderNameArabic) {
        this.serviceProviderNameArabic = serviceProviderNameArabic;
    }

    public String getServiceProviderAddressArabic() {
        return serviceProviderAddressArabic;
    }

    public void setServiceProviderAddressArabic(String serviceProviderAddressArabic) {
        this.serviceProviderAddressArabic = serviceProviderAddressArabic;
    }

    public String getServiceProviderLocationArabic() {
        return serviceProviderLocationArabic;
    }

    public void setServiceProviderLocationArabic(String serviceProviderLocationArabic) {
        this.serviceProviderLocationArabic = serviceProviderLocationArabic;
    }

    public String getServiceProviderCategoryArabic() {
        return serviceProviderCategoryArabic;
    }

    public void setServiceProviderCategoryArabic(String serviceProviderCategoryArabic) {
        this.serviceProviderCategoryArabic = serviceProviderCategoryArabic;
    }

    public String getServiceProviderCategory() {
        return serviceProviderCategory;
    }

    public void setServiceProviderCategory(String serviceProviderCategory) {
        this.serviceProviderCategory = serviceProviderCategory;
    }

    public int getServiceProviderId() {
        return serviceProviderId;
    }

    public void setServiceProviderId(int serviceProviderId) {
        this.serviceProviderId = serviceProviderId;
    }

    public String getServiceProviderMail() {
        return serviceProviderMail;
    }

    public void setServiceProviderMail(String serviceProviderMail) {
        this.serviceProviderMail = serviceProviderMail;
    }

    public String getServiceProviderWebsite() {
        return serviceProviderWebsite;
    }

    public void setServiceProviderWebsite(String serviceProviderWebsite) {
        this.serviceProviderWebsite = serviceProviderWebsite;
    }

    public String getServiceProviderMobile() {
        return serviceProviderMobile;
    }

    public void setServiceProviderMobile(String serviceProviderMobile) {
        this.serviceProviderMobile = serviceProviderMobile;
    }

    public String getServiceProviderMapLocation() {
        return serviceProviderMapLocation;
    }

    public void setServiceProviderMapLocation(String serviceProviderMapLocation) {
        this.serviceProviderMapLocation = serviceProviderMapLocation;
    }

    public String getServiceProviderFacebook() {
        return serviceProviderFacebook;
    }

    public void setServiceProviderFacebook(String serviceProviderFacebook) {
        this.serviceProviderFacebook = serviceProviderFacebook;
    }

    public String getServiceProviderLinkedin() {
        return serviceProviderLinkedin;
    }

    public void setServiceProviderLinkedin(String serviceProviderLinkedin) {
        this.serviceProviderLinkedin = serviceProviderLinkedin;
    }

    public String getServiceProviderInstagram() {
        return serviceProviderInstagram;
    }

    public void setServiceProviderInstagram(String serviceProviderInstagram) {
        this.serviceProviderInstagram = serviceProviderInstagram;
    }

    public String getServiceProviderTwitter() {
        return serviceProviderTwitter;
    }

    public void setServiceProviderTwitter(String serviceProviderTwitter) {
        this.serviceProviderTwitter = serviceProviderTwitter;
    }

    public String getServiceProviderSnapchat() {
        return serviceProviderSnapchat;
    }

    public void setServiceProviderSnapchat(String serviceProviderSnapchat) {
        this.serviceProviderSnapchat = serviceProviderSnapchat;
    }

    public String getServiceProviderGoogleplus() {
        return serviceProviderGoogleplus;
    }

    public void setServiceProviderGoogleplus(String serviceProviderGoogleplus) {
        this.serviceProviderGoogleplus = serviceProviderGoogleplus;
    }

    public String getServiceProviderLogo() {
        return serviceProviderLogo;
    }

    public void setServiceProviderLogo(String serviceProviderLogo) {
        this.serviceProviderLogo = serviceProviderLogo;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ArrayList<ServiceProviderTimeList> getServiceProviderTimeLists() {
        return serviceProviderTimeLists;
    }

    public ServiceProviderResult(String serviceProviderName, String serviceProviderAddress,
                                 String serviceProviderLocation, String serviceProviderCategory,
                                 String serviceProviderNameArabic, String serviceProviderAddressArabic,
                                 String serviceProviderLocationArabic, String serviceProviderCategoryArabic,
                                 int serviceProviderId, String serviceProviderMail, String serviceProviderWebsite,
                                 String serviceProviderMobile, String serviceProviderMapLocation,
                                 String serviceProviderFacebook, String serviceProviderLinkedin,
                                 String serviceProviderInstagram, String serviceProviderTwitter,
                                 String serviceProviderSnapchat, String serviceProviderGoogleplus,
                                 String serviceProviderLogo,
                                 String message, ArrayList<ServiceProviderTimeList> serviceProviderTimeLists) {
        this.serviceProviderName = serviceProviderName;
        this.serviceProviderAddress = serviceProviderAddress;
        this.serviceProviderLocation = serviceProviderLocation;
        this.serviceProviderCategory = serviceProviderCategory;
        this.serviceProviderNameArabic = serviceProviderNameArabic;
        this.serviceProviderAddressArabic = serviceProviderAddressArabic;
        this.serviceProviderLocationArabic = serviceProviderLocationArabic;
        this.serviceProviderCategoryArabic = serviceProviderCategoryArabic;
        this.serviceProviderId = serviceProviderId;
        this.serviceProviderMail = serviceProviderMail;
        this.serviceProviderWebsite = serviceProviderWebsite;
        this.serviceProviderMobile = serviceProviderMobile;
        this.serviceProviderMapLocation = serviceProviderMapLocation;
        this.serviceProviderFacebook = serviceProviderFacebook;
        this.serviceProviderLinkedin = serviceProviderLinkedin;
        this.serviceProviderInstagram = serviceProviderInstagram;
        this.serviceProviderTwitter = serviceProviderTwitter;
        this.serviceProviderSnapchat = serviceProviderSnapchat;
        this.serviceProviderGoogleplus = serviceProviderGoogleplus;
        this.serviceProviderLogo = serviceProviderLogo;
        this.message = message;
        this.serviceProviderTimeLists = serviceProviderTimeLists;
    }
}
