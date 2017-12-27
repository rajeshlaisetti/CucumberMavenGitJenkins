# Author: Nisum QE Team
# Date Created : Feb 05, 2015
# Date Modified:
# Date Signed Off: TBD

Feature: Rendering Banner image according to the contexts in row0,row101,row2,row3,slideshow and widget in home page


###########################################################################
# Story Titles: WDS:: Render HTML banners in Contextual Template
#               WDS :: MCOM :: Render Banner Machine in a Slideshow
#               WDS :: MCOM :: Render Banner Machine in a Widget
# Versionone story numbers:: B-10675,B-10647,B-11470 and B-11471

###################################SITE Mode and Desktop #################################################################

  @artifact_navapp @domain_marketing @release_15E @use_regression @feature_bm @mode_domestic
  Scenario: Home page - Verify the rendering of Banner Machine for top, mid and bottom banners on desktop in DOMESTIC mode
    Given I visit the web site as a guest user
    When I navigate to "Home Page" category with "BANNER_MACHINE" in "0" for context
      | DEVICE_TYPE | REGION_CODE | SHOPPING_MODE | NAVIGATION_TYPE |
      | DESKTOP     | US          | SITE          | BROWSE          |
    Then I should see "BANNER_MACHINE" media on the page in "0" row
    And I should see respective banner machine media as per astra data


  ###################################International Mode and Desktop #################################################################

  @artifact_navapp @domain_marketing @release_15E @use_regression @feature_bm @mode_iship
  Scenario: ISHIP mode - Verify the rendering of Banner Machine for top, mid and bottom banners on desktop in ISHIP mode
    Given I visit the web site as a guest user
    When I change country to "a random country"
    And I close the welcome mat if it's visible
    And I navigate to "Home Page" category with "BANNER_MACHINE" in "0" for context
      | DEVICE_TYPE | REGION_CODE | SHOPPING_MODE | NAVIGATION_TYPE |
      | DESKTOP     | INTL        | SITE          | BROWSE          |
    Then I should see "BANNER_MACHINE" media on the page in "0" row
    And I should see respective banner machine media as per astra data

