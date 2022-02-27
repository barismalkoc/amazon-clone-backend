package bbm.amazonclone.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import bbm.amazonclone.business.abstracts.UserService;
import bbm.amazonclone.core.utilities.results.DataResult;
import bbm.amazonclone.core.utilities.results.Result;
import bbm.amazonclone.core.utilities.results.SuccessDataResult;
import bbm.amazonclone.core.utilities.results.SuccessResult;
import bbm.amazonclone.dataAccess.abstracts.UserDao;
import bbm.amazonclone.entities.concretes.User;

@Service	
public class UserManager implements UserService {
	
	private UserDao userDao;
	
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public Result add(User user) {


		this.userDao.save(user);
		return new SuccessResult("Yeni ürün sisteme eklendi.");
	}

	@Override
	public DataResult<List<User>> getAll() {

		return new SuccessDataResult<List<User>>(this.userDao.findAll(), "Sistemdeki ürünler getirildi.");
	}

}
