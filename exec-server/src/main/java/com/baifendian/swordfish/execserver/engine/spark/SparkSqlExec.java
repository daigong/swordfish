package com.baifendian.swordfish.execserver.engine.spark;

import com.baifendian.swordfish.execserver.common.ResultCallback;
import java.sql.SQLException;
import java.util.List;
import java.util.function.Consumer;
import org.slf4j.Logger;

/**
 * <p>
 *
 * @author : shuanghu
 */
public class SparkSqlExec {
  /**
   * 查询限制，默认为 1000
   */
  private static int defaultQueryLimit = 1000;

  /**
   * 日志处理器
   */
  private Consumer<List<String>> logHandler;

  /**
   * 执行用户
   */
  private String userName;

  /**
   * 记录日志的实例
   */
  private Logger logger;

  public SparkSqlExec(Consumer<List<String>> logHandler, String userName, Logger logger){
    this.logHandler = logHandler;
    this.userName = userName;
    this.logger = logger;
  }

  /**
   * 执行多个 sql 语句 并返回查询的语句, 注意, 多次调用 execute, 上下文是不相关的
   *  @param createFuncs 创建自定义函数语句
   * @param sqls 执行的 sql
   * @param resultCallback 回调, 执行的结果处理
   * @param queryLimit 结果限制
   * @param remainTime 剩余运行时间, 暂没实现
   */
  public boolean execute(List<String> createFuncs, List<String> sqls, boolean isContinue,
      ResultCallback resultCallback, Integer queryLimit, int remainTime) throws SQLException {
    // 没有剩余运行的时间
    if (remainTime <= 0) {
      return false;
    }

    // 查询结果限制
    queryLimit = (queryLimit != null) ? queryLimit : defaultQueryLimit;

    return true;
  }
}
