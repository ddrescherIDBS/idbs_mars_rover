set "DIR=idbs_mars_rover"

if exist "%DIR%\" (
    rmdir /s /q "%DIR%"
)

git clone https://github.com/ddrescherIDBS/idbs_mars_rover.git
cd idbs_mars_rover
mvn install & java -cp "target/idbs_mars_rover-1.0-SNAPSHOT.jar" "com.codemanship.marsrover.Program"
