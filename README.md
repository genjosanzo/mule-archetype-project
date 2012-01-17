Mule Archetype Project

====================

Refactoring of the mule maven archetype, totally based on the new maven archetype 2.x api.

The Mule Archetype Project allows the development of Mule Applications using a simple standard maven archetype. 

Creating a Cloud Connector
--------------------------

Creating a mule application using the mule archetype project is extremely easy. Just invoke it as follows:

	mvn archetype:generate -DarchetypeGroupId=org.mule.tools -DarchetypeArtifactId=mule-archetype-project -DarchetypeVersion=1.4.1
						   -DgroupId=org.mule -DartifactId=mule-test-archetype -Dversion=1.0-SNAPSHOT
						   -DmuleVersion=3.2.1 -DschemaVersion=3.2 -Dpackage=org.mule -Dtransports=file,http,jdbc,jms,vm 
						   -Dmodules=client,cxf,management,scripting,sxc,xml
						
Archetype Parameters:

|parameter|description|
|:--------|:----------|
|archetypeGroupId|The group Id of the archetype. This value is ALWAYS org.mule.tools|
|archetypeArtifactId|The artifact Id of the archetype. This value is ALWAYS mule-archetype-project|
|archetypeVersion|The version of the archetype. This value can change as we release new versions of the archetype. Always use the latest non-SNAPSHOT version available.|
|groupId|The group Id of the application you are creating. A good value would be the reserve name of your company domain name, like: com.mulesoft.app or org.mule.app|
|artifactId|The artifact Id of the application you are creating. |
|version|The version of your application. Usually 1.0-SNAPSHOT.|
|muleVersion|The version of the mule runtime you are going to use. Current default value is 3.2.1 .|
|transports|A comma separated list of the transport you are going to use within your app . Current default value is file,http,jdbc,jms,vm .|
|modules|A comma separated list of the modules you are going to use within your app . Current default value is client,cxf,management,scripting,sxc,xml .|
