@smoke
  Feature:F06_homeSliders | home sliders
    Scenario:first slider is clickable on home page
      When user click on nokia slider
      Then the url "https://demo.nopcommerce.com/nokia-lumia-1020" is opened

    Scenario:second slider is clickable on home page
      When user click on iphone slider
      Then the url "url https://demo.nopcommerce.com/iphone-6" is opened