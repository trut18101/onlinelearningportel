/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoole;

/**
 *
 * @author Goldy
 */
public interface ObserverSubject {

    public void AddObserver(Observer o);

    public void RemoveObserver(Observer o);

    public void NotifyParents();

}
