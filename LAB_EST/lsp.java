
public interface SOCIAL_MEDIA 
{
	
	public void CHAT_FUNCTIONALITY();
	
	
	public void SEND_PHOTO_VIDEO_FUNCTIONALITY();
	  
}  

public interface SOCIAL_POST_MEDIA 
{
	
	public void PUBLISH_POST_FUNCTIONALITY();
	  
} 

public interface SOCIAL_GROUP_VIDEO_CALL 
{
	
	public void GROUP_VIDEO_CALL_FUNCTIONALITY();
	  
}



public class INSTAGRAM implements SOCIAL_MEDIA, SOCIAL_POST_MEDIA
{
	public void CHAT_FUNCTIONALITY()
	{
	
	}
	
	
	public void SEND_PHOTO_VIDEO_FUNCTIONALITY()
	{
	
	}
	
	
	public void PUBLISH_POST_FUNCTIONALITY()
	{
	
	}

}	




public class INSTAGRAM implements SOCIAL_MEDIA, SOCIAL_GROUP_VIDEO_CALL
{
	public void CHAT_FUNCTIONALITY()
	{
	
	}
	
	
	public void SEND_PHOTO_VIDEO_FUNCTIONALITY()
	{
	
	}
	
	
	public void GROUP_VIDEO_CALL_FUNCTIONALITY()
	{
	
	}

}