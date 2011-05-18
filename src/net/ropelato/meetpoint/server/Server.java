package net.ropelato.meetpoint.server;

import net.ropelato.meetpoint.data.Game;

import java.io.IOException;
import java.net.ServerSocket;

public class Server implements Runnable
{
	Thread thread = null;
	ServerSocket serverSocket = null;
	Game game = null;

	public Server(int port)
	{
		System.out.println("starting server...");

		try
		{
			serverSocket = new ServerSocket(port);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}

		game = new Game();

		System.out.println("server running on port "+port);

		thread = new Thread(this);
		thread.start();
	}

	public void run()
	{
		while(true)
		{
			try
			{
				new HttpConnection(serverSocket.accept(), game);
			}
			catch(IOException e)
			{
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args)
	{
		Server server = new Server(1024);
	}
}



