@smoke
  Feature:F03_currencies | could select different currencies

     Scenario: user could switch to euro currency

       When user select euro option
       Then euro symbol is displyed
       When user select us dollar option
       Then us dollar is displayed
