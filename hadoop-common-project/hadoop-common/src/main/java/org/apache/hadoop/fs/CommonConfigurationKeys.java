/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.hadoop.fs;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/** 
 * This class contains constants for configuration keys used
 * in the common code.
 *
 * It inherits all the publicly documented configuration keys
 * and adds unsupported keys.
 *
 */

@InterfaceAudience.Private
@InterfaceStability.Unstable
public class CommonConfigurationKeys extends CommonConfigurationKeysPublic {

  /** Default location for user home directories */
  public static final String  FS_HOME_DIR_KEY = "fs.homeDir";
  /** Default value for FS_HOME_DIR_KEY */
  public static final String  FS_HOME_DIR_DEFAULT = "/user";
  /** Default umask for files created in HDFS */
  public static final String  FS_PERMISSIONS_UMASK_KEY =
    "fs.permissions.umask-mode";
  /** Default value for FS_PERMISSIONS_UMASK_KEY */
  public static final int     FS_PERMISSIONS_UMASK_DEFAULT = 0022;
  /** @deprecated not used, jira was created to remove this constant:
   * https://issues.apache.org/jira/browse/HADOOP-6802
   */
  public static final String  FS_CLIENT_BUFFER_DIR_KEY =
    "fs.client.buffer.dir";
  /** How often does RPC client send pings to RPC server */
  public static final String  IPC_PING_INTERVAL_KEY = "ipc.ping.interval";
  /** Default value for IPC_PING_INTERVAL_KEY */
  public static final int     IPC_PING_INTERVAL_DEFAULT = 60000; // 1 min
  /** Enables pings from RPC client to the server */
  public static final String  IPC_CLIENT_PING_KEY = "ipc.client.ping";
  /** Default value of IPC_CLIENT_PING_KEY */
  public static final boolean IPC_CLIENT_PING_DEFAULT = true;
  /** Responses larger than this will be logged */
  public static final String  IPC_SERVER_RPC_MAX_RESPONSE_SIZE_KEY =
    "ipc.server.max.response.size";
  /** Default value for IPC_SERVER_RPC_MAX_RESPONSE_SIZE_KEY */
  public static final int     IPC_SERVER_RPC_MAX_RESPONSE_SIZE_DEFAULT =
    1024*1024;
  /** Number of threads in RPC server reading from the socket */
  public static final String  IPC_SERVER_RPC_READ_THREADS_KEY =
    "ipc.server.read.threadpool.size";
  /** Default value for IPC_SERVER_RPC_READ_THREADS_KEY */
  public static final int     IPC_SERVER_RPC_READ_THREADS_DEFAULT = 1;
  /** Number of pending connections that may be queued per socket reader */
  public static final String IPC_SERVER_RPC_READ_CONNECTION_QUEUE_SIZE_KEY =
      "ipc.server.read.connection-queue.size";
  /** Default value for IPC_SERVER_RPC_READ_CONNECTION_QUEUE_SIZE */
  public static final int IPC_SERVER_RPC_READ_CONNECTION_QUEUE_SIZE_DEFAULT =
      100;

  /** How many calls per handler are allowed in the queue. */
  public static final String  IPC_SERVER_HANDLER_QUEUE_SIZE_KEY =
    "ipc.server.handler.queue.size";
  /** Default value for IPC_SERVER_HANDLER_QUEUE_SIZE_KEY */
  public static final int     IPC_SERVER_HANDLER_QUEUE_SIZE_DEFAULT = 100;

  /** Internal buffer size for Lzo compressor/decompressors */
  public static final String  IO_COMPRESSION_CODEC_LZO_BUFFERSIZE_KEY =
    "io.compression.codec.lzo.buffersize";
  /** Default value for IO_COMPRESSION_CODEC_LZO_BUFFERSIZE_KEY */
  public static final int     IO_COMPRESSION_CODEC_LZO_BUFFERSIZE_DEFAULT =
    64*1024;
  /** This is for specifying the implementation for the mappings from
   * hostnames to the racks they belong to
   */
  public static final String  NET_TOPOLOGY_CONFIGURED_NODE_MAPPING_KEY =
    "net.topology.configured.node.mapping";

  /** Internal buffer size for Snappy compressor/decompressors */
  public static final String IO_COMPRESSION_CODEC_SNAPPY_BUFFERSIZE_KEY =
      "io.compression.codec.snappy.buffersize";

  /** Default value for IO_COMPRESSION_CODEC_SNAPPY_BUFFERSIZE_KEY */
  public static final int IO_COMPRESSION_CODEC_SNAPPY_BUFFERSIZE_DEFAULT =
      256 * 1024;

  /** Internal buffer size for Snappy compressor/decompressors */
  public static final String IO_COMPRESSION_CODEC_LZ4_BUFFERSIZE_KEY =
      "io.compression.codec.lz4.buffersize";

  /** Default value for IO_COMPRESSION_CODEC_SNAPPY_BUFFERSIZE_KEY */
  public static final int IO_COMPRESSION_CODEC_LZ4_BUFFERSIZE_DEFAULT =
      256 * 1024;

  /**
   * Service Authorization
   */
  public static final String 
  HADOOP_SECURITY_SERVICE_AUTHORIZATION_REFRESH_POLICY = 
      "security.refresh.policy.protocol.acl";
  public static final String 
  HADOOP_SECURITY_SERVICE_AUTHORIZATION_GET_USER_MAPPINGS =
      "security.get.user.mappings.protocol.acl";
  public static final String 
  HADOOP_SECURITY_SERVICE_AUTHORIZATION_REFRESH_USER_MAPPINGS =
      "security.refresh.user.mappings.protocol.acl";
  
  public static final String HADOOP_SECURITY_TOKEN_SERVICE_USE_IP =
      "hadoop.security.token.service.use_ip";
  public static final boolean HADOOP_SECURITY_TOKEN_SERVICE_USE_IP_DEFAULT =
      true;
  
  public static final String  IPC_CLIENT_FALLBACK_TO_SIMPLE_AUTH_ALLOWED_KEY = "ipc.client.fallback-to-simple-auth-allowed";
  public static final boolean IPC_CLIENT_FALLBACK_TO_SIMPLE_AUTH_ALLOWED_DEFAULT = false;

}

