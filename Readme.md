# Name convention:
if you see same functionality name: share the page and communicate with each other

      Feature file: US01_functionalityName_nameInitials.feature
      EX:           US12_customerInfo_WH.feature
      
      Pages class:  PageName_page_nameInitials.java
      EX:           CustomerInfo_page_WH.java
      
      Step Definition: FunctionalityName_stepDef_nameInitials.java
      EX:              CustomerInfo_stepDef_WH.java

      GIT branch name: US01_UserName
      EX:              US12_Warda

      TC in Jira: US#AC# summary
      EX:         US12AC1 - Users should see 8 filter items on the Accounts page 

# GIT FLOW:
            Branch that we will push changes: develop branch
- write your codes
- do commits
- after last commit
- update your local develop branch ("fetch" and "pull")
- merge develop into your branch
- then you push from your local branch to your origin(remote) branch
- On GIT create a pull request(base:develop, compare:yourBranch) from your origin branch to develop branch
- then assign your assignee(communicate to them(send a discord message))


# important
- do not touch the utilities (stays as it is)
- do not push to "backUp" and "master" branches


