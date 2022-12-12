swagger文档地址：https://deep-index.moralis.io/api-docs/#/info



# EVM API:

## native:

- /block/{block_number_or_hash}:

​        返回： BlockVO对象

-  /dateToBlock

​         返回： BlockDataVO对象

- /{address}/logs

​         返回： LogCollectionVO对象

​                      	包含LogEventByAddressVO对象

-  /block/{block_number_or_hash}/nft/transfers

​          返回： NftTransferCollectionVO对象

​                      	包含NftTransferVO对象

- /transaction/{transaction_hash}

​          返回： BlockTransactionVO对象

​                       	包含LogVO对象

- /{address}/events

  ​    返回： LogEventVO对象

  ​                	EventContentVO对象

- /{address}/function

  ​     返回： RunContractDto对象

| 方法                                        | 返回对象                |
| ------------------------------------------- | ----------------------- |
| /block/{block_number_or_hash}:              | BlockVO                 |
| /dateToBlock                                | BlockDataVO             |
| /{address}/logs                             | LogCollectionV          |
| /block/{block_number_or_hash}/nft/transfers | NftTransferCollectionVO |
| /transaction/{transaction_hash}             | BlockTransactionVO      |
| /{address}/events                           | LogEventVO              |
| /{address}/function                         | RunContractDto          |



## account

- /{address}

  返回： TransactionCollectionVO对象

  ​             	TransactionVO对象

- /{address}/verbose

​         返回： TransactionVerboseCollectionVO对象

​                      	包含BlockTransactionVO对象

- /{address}/balance

​         返回： NativeBalancenVO对象

- /{address}/erc20

​          返回：Erc20TokenBalanceVO对象

- /{address}/erc20/transfers

​         返回： Erc20TransactionCollectionVO对象

​                 		包含Erc20TransactionVO对象

- /{address}/nft

  ​    返回： NftOwnerCollectionVO对象

  ​                 	包含NftOwnerVO对象

  ​                         包含NormalizedMetadataVO对象

  ​                         	包含NormalizedMetadataAttributeVO对象

- /{address}/nft/transfers

  ​     返回： NftTransferCollectionVO对象

  ​                  	包含NftTransferVO对象

- /{address}/nft/collections

  ​    返回： NftWalletCollectionsVO对象

  ​                 	NftCollectionsVO对象

- /{address}/nft/{token_address}

  ​    返回：NftOwnerCollectionVO对象

  ​                 	包含NftOwnerVO对象

  ​                         包含NormalizedMetadataVO对象

  ​                         	包含NormalizedMetadataAttributeVO对象



| 方法                           | 返回对象                       |
| ------------------------------ | ------------------------------ |
| /{address}                     | TransactionCollectionVO        |
| /{address}/verbose             | TransactionVerboseCollectionVO |
| /{address}/balance             | NativeBalancenVO               |
| /{address}/erc20               | Erc20TokenBalanceVO            |
| /{address}/erc20/transfers     | Erc20TransactionCollectionVO   |
| /{address}/nft                 | NftOwnerCollectionVO           |
| /{address}/nft/transfers       | NftTransferCollectionVO        |
| /{address}/nft/collections     | NftWalletCollectionsVO         |
| /{address}/nft/{token_address} | NftOwnerCollectionVO           |





## token

- /erc20/metadata

  返回： Erc20MetadataVO对象

- /nft/{address}/trades

​        返回： TradeCollectionVO对象

​                    	包含TradeVO对象

- /nft/{address}/lowestprice

    返回： TradeVO对象

- /erc20/metadata/symbols

​         返回：Erc20MetadataVO对象

- /erc20/{address}/price

   返回： Erc20PriceVO对象

  ​              	包含 NativeErc20PriceVO对象

- /erc20/{address}/transfers

    返回： Erc20TransactionCollectionVO对象

  ​                   包含Erc20TransactionVO对象

- /erc20/{address}/allowance

​          返回： Erc20AllowanceVO对象

- /nft/search

     返回： NftMetadataCollectionVO对象

  ​                	包含NftMetadataVO对象

- /nft/transfers

​         返回： NftTransferCollectionVO对象

​                      	包含NftTransferVO对象

- /nft/{address}

   返回：  NftCollectionVO对象

  ​                   包含NftVO对象

- /nft/getMultipleNFTs

   返回： GetMultipleNftsDto对象

- /nft/{address}/transfers

    返回： NftTransferCollectionVO对象

  ​                   包含NftTransferVO对象 

- /nft/{address}/owners

    返回： NftOwnerCollectionVO对象

  ​                   包含NftOwnerVO对象

- /nft/{address}/metadata

​          返回： NftContractMetadataVO对象

- /nft/{address}/{token_id}/metadata/resync

     返回： MetadataResyncVO对象

- /nft/{address}/{token_id}

​          返回： NftVO对象

- /nft/{address}/{token_id}/owner

  ​    返回： NftOwnerCollectionVO对象

- /nft/{address}/{token_id}/transfer

  ​    返回： NftTransferCollectionVO对象

| 方法                                      | 返回对象                     |
| ----------------------------------------- | ---------------------------- |
| /erc20/metadata                           | Erc20MetadataVO              |
| /nft/{address}/trades                     | TradeCollectionVO            |
| /nft/{address}/lowestprice                | TradeVO                      |
| /erc20/metadata/symbols                   | List<Erc20MetadataVO>        |
| /erc20/{address}/price                    | Erc20PriceVO                 |
| /erc20/{address}/transfers                | Erc20TransactionCollectionVO |
| /erc20/{address}/allowance                | Erc20AllowanceVO             |
| /nft/search                               | NftMetadataCollectionVO      |
| /nft/transfers                            | NftTransferCollectionVO      |
| /nft/{address}                            | NftCollectionVO              |
| /nft/getMultipleNFTs                      | GetMultipleNftsDto           |
| /nft/{address}/transfers                  | NftTransferCollectionVO      |
| /nft/{address}/owners                     | NftOwnerCollectionVO         |
| /nft/{address}/metadata                   | NftContractMetadataVO        |
| /nft/{address}/{token_id}/metadata/resync | MetadataResyncVO             |
| /nft/{address}/{token_id}                 | NftVO                        |
| /nft/{address}/{token_id}/owners          | NftOwnerCollectionVO         |
| /nft/{address}/{token_id}/transfers       | NftTransferCollectionVO      |



## contract

/nft/{address}/sync

返回String值



## resolve

/resolve/{domain}

返回string

/resolve/{address}/reverse

返回EnsVO对象



## defi

/{pair_address}/reserves

返回ReservesPairVO对象

/{token0_address}/{token1_address}/pairAddress

返回reservesCollection对象



## storage

reservesCollection

返回string



## info

/web3/version

返回String

/info/endpointWeights

返回EndpointWeightsVO对象