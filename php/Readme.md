# Run phpunit without composer

as per https://phpunit.de/getting-started/phpunit-5.html

    wget -O phpunit https://phar.phpunit.de/phpunit-5.phar
    chmod +x phpunit
    
then run it with

    ./phpunit --configuration ./test/phpunit.xml 
    