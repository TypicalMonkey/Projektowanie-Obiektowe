<?php

use App\Kernel;

use Shop\Vegetable\Tomato

return function (array $context) {
    return new Kernel($context['APP_ENV'], (bool) $context['APP_DEBUG']);
};
