<?php
spl_autoload_register(function ($class) {
//    $baseDir = __DIR__.'/../src/tripservicekata/';
//    include_once $baseDir.'trip/TripService.class.php';
//    include_once $baseDir.'trip/TripDao.class.php';
//    include_once $baseDir.'trip/Trip.class.php';
//    include_once $baseDir.'exception/DependendClassCallDuringUnitTestException.class.php';
//    include_once $baseDir.'exception/UserNotLoggedInException.class.php';
//    include_once $baseDir.'user/UserSession.class.php';
//    include_once $baseDir.'user/User.class.php';

    $path = realpath(dirname(__FILE__)."/src/");
    $directory = new RecursiveDirectoryIterator($path);
    $dirIter = new RecursiveIteratorIterator($directory);
    /** @var SplFileInfo $file */
    foreach ($dirIter as $file) {
        if (!$file->isFile()) {
            continue;
        }

        $name = $file->getPathname();
        if (!preg_match('#\.php$#', $name)) {
            continue;
        }

        include_once $file->getPathname();
    }
});
