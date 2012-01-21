Mule Archetype Project

====================

Refactoring of the mule maven archetype, totally based on the new maven archetype 2.x api.

The Mule Archetype Project allows the development of Mule Applications using a simple standard maven archetype. 

Configuring your settings.xml
--------------------------

Since the archetype has not been deployed to the standard maven repositories yet you need to add the following server
to your maven settings.xml
	
	<repository>
	 	<id>muleforge-releases</id>
	    <name>MuleForge Snapshot Repository</name>
	    <url>https://repository.mulesoft.org/releases/</url>
		<releases>
            <enabled>true</enabled>
        </releases>
        <snapshots>
            <enabled>true</enabled>
        </snapshots>
	 </repository> 

Creating a Mule Application
--------------------------

Creating a mule application using the mule archetype project is extremely easy. Just invoke it as follows:

	mvn archetype:generate -DarchetypeGroupId=org.mule.tools -DarchetypeArtifactId=mule-archetype-project -DarchetypeVersion=1.5 \
						   -DgroupId=org.mule -DartifactId=mule-test-archetype -Dversion=1.0-SNAPSHOT \
						   -DmuleVersion=3.2.1 -DaddAppToClasspath=false \
						   -Dtransports=file,http,jdbc,jms,vm -Dmodules=client,cxf,management,scripting,sxc,xml
						
Archetype Parameters:

|parameter|description|default|
|:--------|:----------|:----------|
|archetypeGroupId|The group Id of the archetype This value must ALWAYS org.mule.tools|org.mule.tools|
|archetypeArtifactId|The artifact Id of the archetype| This value must ALWAYS mule-archetype-project|mule-archetype-project|
|archetypeVersion|The version of the archetype. This value can change as we release new versions of the archetype. Always use the latest non-SNAPSHOT version available.|1.5|
|groupId|The group Id of the application you are creating. A good value would be the reserve name of your company domain name, like: com.mulesoft.app or org.mule.app||
|artifactId|The artifact Id of the application you are creating. ||
|version|The version of your application. Usually 1.0-SNAPSHOT.|1.0-SNAPSHOT|
|muleVersion|The version of the mule runtime you are going to use. Mule 2.2.x is no longer supported|3.2.1|
|addAppToClasspath|A flag to either add the src/main/app/ folder as a resource folder to easily access it within your IDE|false|
|transports|A comma separated list of the transport you are going to use within your application.|file,http,jdbc,jms,vm |
|modules|A comma separated list of the modules you are going to use within your application. |client,cxf,management,scripting,sxc,xml |

