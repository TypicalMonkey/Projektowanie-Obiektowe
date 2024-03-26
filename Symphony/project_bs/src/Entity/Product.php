<?php

namespace App\Entity;

use App\Repository\ProductRepository;
use Doctrine\DBAL\Types\Types;
use Doctrine\ORM\Mapping as ORM;

#[ORM\Entity(repositoryClass: ProductRepository::class)]
class Product
{
    #[ORM\Id]
    #[ORM\GeneratedValue]
    #[ORM\Column]
    private ?int $id = null;

    #[ORM\Column(length: 255)]
    private ?string $nazwa = null;

    #[ORM\Column(length: 255, nullable: true)]
    private ?string $opis = null;

    #[ORM\Column(type: Types::DECIMAL, precision: 8, scale: '0', nullable: true)]
    private ?string $cena = null;

    #[ORM\Column]
    private ?int $ilosc = null;

    public function getId(): ?int
    {
        return $this->id;
    }

    public function getNazwa(): ?string
    {
        return $this->nazwa;
    }

    public function setNazwa(string $nazwa): static
    {
        $this->nazwa = $nazwa;

        return $this;
    }

    public function getOpis(): ?string
    {
        return $this->opis;
    }

    public function setOpis(?string $opis): static
    {
        $this->opis = $opis;

        return $this;
    }

    public function getCena(): ?string
    {
        return $this->cena;
    }

    public function setCena(?string $cena): static
    {
        $this->cena = $cena;

        return $this;
    }

    public function getIlosc(): ?int
    {
        return $this->ilosc;
    }

    public function setIlosc(int $ilosc): static
    {
        $this->ilosc = $ilosc;

        return $this;
    }
}
