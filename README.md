
localhost:8080/users/save

body
{
    "userName": "gdgdgd",
    "email": "fdghfghgfhggfh"
}

ответ:
 {
    "id": 1,
    "secretKey": "b8aa818f-3fd5-422e-ab02-9da77aec5ef9",
    "userName": "gdgdgd",
    "email": "fdghfghgfhggfh",
    "currencyName": null,
    "walletDto": {
        "id": 1,
        "rubWallet": null,
        "btcWallet": null,
        "tonWallet": null,
        "userId": null
    }
}

localhost:8080/users/balance?secretKey=b8aa818f-3fd5-422e-ab02-9da77aec5ef9

ответ:
{
    "id": 1,
    "rubWallet": 0,
    "btcWallet": 0,
    "tonWallet": 0
}
