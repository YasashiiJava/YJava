class StopWatch
{
	private long _time;
	private long _diff;

	public void start()
	{
		_time = System.currentTimeMillis();
	}
	public void stop()
	{
		_diff = System.currentTimeMillis() - _time;
	}
	public long getDiff()
	{
		return _diff;
	}
}

class Main
{
	public static void main(String[] args)
	{
		StopWatch stopWatch = new StopWatch();
		stopWatch.start();
		try{
			Thread.sleep(1000);
		}catch(Exception e){}
		stopWatch.stop();
		long diff = stopWatch.getDiff();
		System.out.println(diff + "ミリ秒かかりました");
	}
}