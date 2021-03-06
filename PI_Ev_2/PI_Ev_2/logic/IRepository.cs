﻿using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace PI_Ev_2.logic
{
    interface IRepository
    {
        ObservableCollection<MyItem> GetItems();
        bool AddItem(MyItem item);
        bool RemoveItem(MyItem item);
        bool UpdateItem(MyItem updatedItem, int pos);

        ObservableCollection<Supply> GetSupplies();
        bool AddSupply(Supply supply);
        bool RemoveSupply(Supply supply);
        bool UpdateSupply(Supply updatedSupply, int pos);

        ObservableCollection<Race> GetRaces();
        bool AddRace(Race race);
        bool RemoveRace(Race race);
        bool UpdateRace(Race updatedRace, int pos);
    }
}
