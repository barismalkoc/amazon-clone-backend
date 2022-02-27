package bbm.amazonclone.business.abstracts;

import java.util.List;

import bbm.amazonclone.core.utilities.results.DataResult;
import bbm.amazonclone.core.utilities.results.Result;
import bbm.amazonclone.entities.concretes.User;

public interface UserService {
	
	public Result add(User user);
	public DataResult<List<User>> getAll();

}
