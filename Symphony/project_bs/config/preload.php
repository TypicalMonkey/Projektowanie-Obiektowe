    <?php

    namespace App;

    use function file_exists as fileExistsFunction;

    if (fileExistsFunction(dirname(__DIR__).'/var/cache/prod/App_KernelProdContainer.preload.php')) {
        require_once dirname(__DIR__).'/var/cache/prod/App_KernelProdContainer.preload.php';
    }
