swagger文档地址：https://api.moralis-streams.com/api-docs/

方法默认均为GET方法，非GET方法会注明其他方法

# stream API:

## [History](https://api.moralis-streams.com/api-docs/#/History)

- /history

  返回historyTypes.HistoryResponse对象
  

- /history/replay/P{streamID}/{id}

  ​     返回： historyTypes.HistoryModel对象

| 方法                             | 返回对象                     |
| -------------------------------- | ---------------------------- |
| /history                         | historyTypes.HistoryResponse |
| /history/replay/P{streamID}/{id} | historyTypes.HistoryModel    |



## [Project](https://api.moralis-streams.com/api-docs/#/Project)

- /settings

  返回： settingsTypes.SettingsModel对象

- (POST)/settings

​         返回： settingsTypes.SettingsModel对象



| 方法              | 返回对象                    |
| ----------------- | --------------------------- |
| /settings         | settingsTypes.SettingsModel |
| （POST) /settings | settingsTypes.SettingsModel |





## [Stats](https://api.moralis-streams.com/api-docs/#/Stats)

- /stats

  返回： usagestatsTypes.UsageStatsModel对象

- /stats/{streamId}

​        返回： usagestatsTypes.UsageStatsModeld对象



| 方法              | 返回对象                        |
| ----------------- | ------------------------------- |
| /stats            | usagestatsTypes.UsageStatsModel |
| /stats/{streamId} | usagestatsTypes.UsageStatsModel |



## [EVM Streams](https://api.moralis-streams.com/api-docs/#/EVM Streams)

- /streams/evm

  返回： streamsTypes.StreamsResponse对象

- (PUT)/streams/evm

​        返回：streamsTypes.StreamsModelCreate对象

-  /streams/evm/{id}

   返回： streamsTypes.StreamsModel对象

- (POST)/streams/evm/{id}

​        返回： Partial_streamsTypes.StreamsModelCreate_对象

- (DELETE)/streams/evm/{id}

  返回： streamsTypes.StreamsModel对象

- (POST)/streams/evm/{id}/status

​        返回： streamsTypes.StreamsStatusUpdate对象

- /streams/evm/{id}/address

​        返回： addressesTypes.AddressesResponse对象

- (POST)/streams/evm/{id}/address

​        返回： addressesTypes.AddressResponse对象

- (DELETE)/streams/evm/{id}/address

  返回： addressesTypes.AddressResponse对象



| 方法                              | 返回对象                                 |
| --------------------------------- | ---------------------------------------- |
| /streams/evm                      | streamsTypes.StreamsResponse             |
| (PUT)/streams/evm                 | streamsTypes.StreamsModelCreate          |
| /streams/evm/{id}                 | streamsTypes.StreamsModel                |
| (POST)/streams/evm/{id}           | Partial_streamsTypes.StreamsModelCreate_ |
| (DELETE)/streams/evm/{id}         | streamsTypes.StreamsModel                |
| (POST)/streams/evm/{id}/status    | streamsTypes.StreamsStatusUpdate         |
| /streams/evm/{id}/address         | addressesTypes.AddressesResponse         |
| (POST)/streams/evm/{id}/address   | addressesTypes.AddressResponse           |
| (DELETE)/streams/evm/{id}/address | addressesTypes.AddressResponse           |



