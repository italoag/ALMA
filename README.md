ALMA - Application Lifecycle Management Advantage
=========================================================================
Copyright &copy; 2013 -, Italo Amorim Gomes. Licensed under [GPL License].

[![Build Status](https://secure.travis-ci.org/italoag/ALMA.png)](http://travis-ci.org/italoag/ALMA)

About
-----
ALMA is an open source Application Lifecycle Management platform. It provides a full-blown Java Enterprise Development Factory using your favorite tools, in less than 5 minutes.

It's purpose is to manage a seemless integration between Software Configuration Management ([SCM]), Issue Tracking System ([ITS]), Continuous Integration System ([CIS]), Repository Management System ([RMS]), Code Quality Management ([CQM]) and other tools in order to provide a complete Software Factory, ALMA was inspired and based in a great ALM tool called Jabox with more extented purpose.

Its core is implementation agnostic and there are plugins that glue together each module, in order to provide better extensibility.

It supports automatic download and installation of the modules so that the whole installation process is managed directly by ALMA.

There are no external dependencies apart from a JRE and two port numbers (one for ALMA, and one for the Container of your ALM)

Downloads
---------
Binaries such as WAR files can be found at the [Download page].

Source
------
The source of ALMA can be found on [GitHub]. Fork us!

Website
-------
All about ALMA can be found on our [website].
News can be found on our [blog].
Follow us on Twitter @[ALMAdvantage].
Sign-up to our [mailing list].

Getting Started
---------------

You can launch alma directly from command line:

    java -jar alma-webapp-*-jetty-console.war

or deploy the war to a Servlet Container such as Tomcat.

To be Supported Modules
=======================

Below you will find a list of modules that ALMA currently supports. Each of these components is isolated meaning that adding new modules is easy to do.

Software Configuration Management ([SCM])
---------------------------------------

- Open Source:
 - [Subversion](http://subversion.tigris.org/)
 - [Git](http://git-scm.com/)
 - [Mercurial](http://mercurial.org)
- Online Services:
 - [Bitbucket](https://bitbucket.org/)
 - [Github](https://github.com/)
 - [Gitorious](https://gitorious.org/)
 - [Beanstalk](http://beanstalkapp.com/)

Issue Tracking System ([ITS])
---------------------------

- Open Source:
 - [Redmine](http://www.redmine.org/)
 - [Bugzilla](http://www.bugzilla.org/)
 - [Mantis](http://www.mantisbt.org/)
 - [Jtrac](http://www.jtrac.info/)

Continuous Integration System ([CIS])
-------------------------------------

- Open Source:
 - [Travis](http://jenkins-ci.org/)
 - [Jenkins](http://jenkins-ci.org/)
 - [Janky](http://github.com/github/janky)

Repository Management System ([RMS])
------------------------------------

- Open Source:
 - [Artifactory](http://www.jfrog.com/products.php)
 - [Archiva](http://archiva.apache.org/)
 - [Nexus](http://nexus.sonatype.org/)

Code Quality Management ([CQM])
-------------------------------

- Open Source: 
 - [Sonar](http://www.sonarsource.org/)

[GPL License]: https://github.com/italoag/alma/raw/master/LICENSE.txt
[Download page]: http://alma.troubleshooter.com.br/wiki/Download
[GitHub]: https://github.com/italoag/alma
[website]: http://www.almadvantage.org/
[blog]: http://almadvantage.tumblr.com/
[mailing list]: http://groups.google.com/group/users-alma/topics
[ALMAdvantage]: http://twitter.com/ALMAdvantage
[SCM]: http://redmine.almadvantage.org/projects/almadvantage/wiki/Software_Configuration_Management
[ITS]: http://redmine.almadvantage.org/projects/almadvantage/wiki/Issue_Tracking_System
[CIS]: http://redmine.almadvantage.org/projects/almadvantage/wiki/Continuous_Integration_System
[RMS]: http://redmine.almadvantage.org/projects/almadvantage/wiki/Repository_Management_System
[CQM]: http://redmine.almadvantage.org/projects/almadvantage/wiki/Code_Quality_Management

