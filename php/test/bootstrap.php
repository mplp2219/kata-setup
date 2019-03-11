<?php
spl_autoload_register(function ($class) {
    $path = realpath(__DIR__."/../src");
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
