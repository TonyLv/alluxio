// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: grpc/table/table_master.proto

package alluxio.grpc.table;

public interface FileStatisticsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:alluxio.grpc.table.FileStatistics)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   *map column names to column statistics
   * </pre>
   *
   * <code>map&lt;string, .alluxio.grpc.table.ColumnStatisticsInfo&gt; column = 1;</code>
   */
  int getColumnCount();
  /**
   * <pre>
   *map column names to column statistics
   * </pre>
   *
   * <code>map&lt;string, .alluxio.grpc.table.ColumnStatisticsInfo&gt; column = 1;</code>
   */
  boolean containsColumn(
      java.lang.String key);
  /**
   * Use {@link #getColumnMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, alluxio.grpc.table.ColumnStatisticsInfo>
  getColumn();
  /**
   * <pre>
   *map column names to column statistics
   * </pre>
   *
   * <code>map&lt;string, .alluxio.grpc.table.ColumnStatisticsInfo&gt; column = 1;</code>
   */
  java.util.Map<java.lang.String, alluxio.grpc.table.ColumnStatisticsInfo>
  getColumnMap();
  /**
   * <pre>
   *map column names to column statistics
   * </pre>
   *
   * <code>map&lt;string, .alluxio.grpc.table.ColumnStatisticsInfo&gt; column = 1;</code>
   */

  alluxio.grpc.table.ColumnStatisticsInfo getColumnOrDefault(
      java.lang.String key,
      alluxio.grpc.table.ColumnStatisticsInfo defaultValue);
  /**
   * <pre>
   *map column names to column statistics
   * </pre>
   *
   * <code>map&lt;string, .alluxio.grpc.table.ColumnStatisticsInfo&gt; column = 1;</code>
   */

  alluxio.grpc.table.ColumnStatisticsInfo getColumnOrThrow(
      java.lang.String key);
}
