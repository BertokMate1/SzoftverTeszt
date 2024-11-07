package uni.sw.unit.testing;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import static org.mockito.ArgumentMatchers.anyBoolean;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.ArgumentMatchers.eq;
import org.mockito.Mockito;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class UserTest {
    
    User mockUser = Mockito.mock(User.class);

    @Test
    public void userNameTest(){
        when(mockUser.getUserName()).thenReturn("xd");
        assertEquals("xd",mockUser.getUserName());

        verify(mockUser).getUserName();
    }

    @Test
    public void passwordTest(){
        when(mockUser.getPassword()).thenReturn("xdd");
        assertEquals("xdd",mockUser.getPassword());

        verify(mockUser).getPassword();
    }

    @Test
    public void loginTest(){
        when(mockUser.isLoggedIn()).thenReturn(true);
        assertTrue(mockUser.isLoggedIn());

        verify(mockUser).isLoggedIn();
    }

    @Test
    public void idTest() {
        when(mockUser.getId()).thenReturn(123);
        assertEquals(123,mockUser.getId());

        verify(mockUser).getId();
    }

    @Test
    public void timesTest() {
        when(mockUser.getPassword()).thenReturn("xdd");
        assertEquals("xdd",mockUser.getPassword());

       // verify(mockUser).getPassword();

        assertEquals(3,mockUser.getPassword().length());
        verify(mockUser, times(2)).getPassword();
    }

    @Test
    public void throwTest() {
        doThrow(new UnsupportedOperationException()).when(mockUser).isLoggedIn();
        assertThrows(
            UnsupportedOperationException.class,
            mockUser::isLoggedIn
        );
    }

    @Test
    public void anyTest() {
        when(mockUser.getAcademicAvgInt(anyInt())).thenReturn(4.6);
        assertEquals(4.6, mockUser.getAcademicAvgInt(2));
        assertEquals(4.6, mockUser.getAcademicAvgInt(3));
    }

    @Test
    public void updateTest() {
        when(mockUser.update(anyString(), eq(true))).thenReturn(true);
        assertTrue(mockUser.update("vala", true));

        verify(mockUser).update("vala",true);

        doThrow(new UnsupportedOperationException()).when(mockUser).update(anyString(), anyBoolean());
    }

    @Test
    public void defaultConstTest() {
        User defUser = new User();
        assertNotNull(defUser,"user should not be null");
        assertNull(defUser.getUserName(), "username should be null");
        assertNull(defUser.getPassword(), "pw should be null");
        assertEquals(0, defUser.getId(),"id should be 0");
    }
}