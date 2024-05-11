<?php

use Symfony\Component\Dotenv\Dotenv;
use function file_exists as fileExistsFunction;

require_once dirname(__DIR__).'/vendor/autoload.php';

if (fileExistsFunction(dirname(__DIR__).'/config/bootstrap.php')) {
    require_once dirname(__DIR__).'/config/bootstrap.php';
} elseif (method_exists(Dotenv::class, 'bootEnv')) {
    (new Dotenv())->bootEnv(dirname(__DIR__).'/.env');
}
