/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.hadoop.hive.metastore.txn;

/**
 * ACID metrics info object.
 */
public class MetricsInfo {

  private int txnToWriteIdCount;
  private int completedTxnsCount;
  private int openTxnsCount;
  private int oldestOpenTxnId;
  private int oldestOpenTxnAge;
  private int abortedTxnsCount;
  private int oldestAbortedTxnId;
  private int oldestAbortedTxnAge;

  public int getTxnToWriteIdCount() {
    return txnToWriteIdCount;
  }

  public void setTxnToWriteIdCount(int txnToWriteIdCount) {
    this.txnToWriteIdCount = txnToWriteIdCount;
  }

  public int getCompletedTxnsCount() {
    return completedTxnsCount;
  }

  public void setCompletedTxnsCount(int completedTxnsCount) {
    this.completedTxnsCount = completedTxnsCount;
  }

  public int getOpenTxnsCount() {
    return openTxnsCount;
  }

  public void setOpenTxnsCount(int openTxnsCount) {
    this.openTxnsCount = openTxnsCount;
  }

  public int getOldestOpenTxnId() {
    return oldestOpenTxnId;
  }

  public void setOldestOpenTxnId(int oldestOpenTxnId) {
    this.oldestOpenTxnId = oldestOpenTxnId;
  }

  public int getOldestOpenTxnAge() {
    return oldestOpenTxnAge;
  }

  public void setOldestOpenTxnAge(int oldestOpenTxnAge) {
    this.oldestOpenTxnAge = oldestOpenTxnAge;
  }

  public int getAbortedTxnsCount() {
    return abortedTxnsCount;
  }

  public void setAbortedTxnsCount(int abortedTxnsCount) {
    this.abortedTxnsCount = abortedTxnsCount;
  }

  public int getOldestAbortedTxnId() {
    return oldestAbortedTxnId;
  }

  public void setOldestAbortedTxnId(int oldestAbortedTxn) {
    this.oldestAbortedTxnId = oldestAbortedTxn;
  }

  public int getOldestAbortedTxnAge() {
    return oldestAbortedTxnAge;
  }

  public void setOldestAbortedTxnAge(int oldestAbortedTxnAge) {
    this.oldestAbortedTxnAge = oldestAbortedTxnAge;
  }
}
