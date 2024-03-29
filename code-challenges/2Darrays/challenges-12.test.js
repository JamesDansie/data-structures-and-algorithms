'use strict';

/* ------------------------------------------------------------------------------------------------
CHALLENGE 1

You friend Pat has a chain of stores around the greater Seattle area. He specializes in selling salmon cookies. Pat has data for the hourly sales of cookies per hour for each store. He wants to create an array of the total number of cookies sold per hour for all of his stores combined.

Write a function named grandTotal that adds up the cookies sales for each hour of operation for all of the stores combined. For example, the first element in the hourlySales array should be the sum of the cookies sold in the 9:00 a.m. hour at all five stores combined.

For this example, the total at 9:00 a.m. is 17 + 26 + 7 + 5 + 33, or 88 total cookies.

Return the array of the total number of cookies sold per hour for all of the stores combined.
------------------------------------------------------------------------------------------------ */

const hoursOpen = ['9 a.m.', '10 a.m.', '11 a.m.', '12 p.m.', '1 p.m.', '2 p.m.', '3 p.m.', '4 p.m.', '5 p.m.', '6 p.m.', '7 p.m.', '8 p.m.'];

const firstPike = [17, 18, 23, 24, 24, 12, 13, 27, 30, 20, 24, 18];
const seaTac = [26, 5, 5, 59, 23, 39, 38, 20, 30, 7, 59, 43];
const seattleCenter = [7, 14, 19, 22, 15, 4, 23, 27, 28, 23, 1, 29];
const capHill = [5, 85, 58, 51, 50, 13, 33, 32, 47, 94, 31, 62];
const alkiBeach = [33, 31, 147, 130, 27, 93, 38, 126, 141, 63, 46, 17];

const cookieStores = [firstPike, seaTac, seattleCenter, capHill, alkiBeach];

const grandTotal = (stores) => {
  // Solution code here...
  // console.log(stores)
  let total = [];
  for(let i = 0; i < stores[0].length; i++){
    let sum = 0;
    for(let x = 0; x < stores.length; x++){
      sum += stores[x][i]
    }
    total.push(sum);
  }
  return total;

};

/* ------------------------------------------------------------------------------------------------
CHALLENGE 2

Pat has decided that he would also like to organize his data as objects containing the number of cookies sold per hour and the time.

Here is sample data for the 9:00 sales: { sales: '88 cookies', time: '9 a.m.' }.

Write a function named salesData that uses forEach to iterate over the hourlySales array and create an object for each hour. Return an array of the formatted data.
------------------------------------------------------------------------------------------------ */

const salesData = (hours, data) => {
  // Solution code here...
  let result = [];
  // for(let i = 0; i < hours.length; i++){
  //   result.push({time: hours[i], sales: `${data[i]} cookies`});
  // }

  hours.forEach((times, i) => {
    result.push({time: times, sales: `${data[i]} cookies`});

  })
  return result;
};

/* ------------------------------------------------------------------------------------------------
CHALLENGE 3

Write a function named howManyTreats that will return the quantity of treats you need to pick up from the pet store today from this array.
------------------------------------------------------------------------------------------------ */

const errands = [
  { store: 'Grocery store',
    items: [ { name: 'Eggs', quantity: 12 }, { name: 'Milk', quantity: 1 }, { name: 'Apples', quantity: 3 }]
  },
  { store: 'Drug store',
    items: [ { name: 'Toothpaste', quantity: 1 }, { name: 'Toothbrush', quantity: 3 }, { name: 'Mouthwash',quantity: 1 } ]
  },
  { store: 'Pet store',
    items: [ { name: 'Cans of food', quantity: 8 }, { name: 'Treats', quantity: 24 }, { name: 'Leash', quantity: 1 } ]
  }
];

const howManyTreats = (arr) => {
  // Solution code here...
  let total = 0;
  arr.forEach(obj => {
    obj.items.forEach(item => {
      if(item.name === 'Treats') total += item.quantity;
    })
  })
  return total;
};

/* ------------------------------------------------------------------------------------------------
CHALLENGE 4

Write a function named battleship that accepts a 2D array and two numbers: a row coordinate and a column coordinate.

Return "hit" or "miss" depending on if there's part of a boat at that position in the array. Assume the array has only one of two values at each index. '#' for part of a boat, or ' ' for open water.

Here is a sample board:
[
  ['#', ' ', '#', ' '],
  ['#', ' ', '#', ' '],
  ['#', ' ', ' ', ' '],
  [' ', ' ', '#', '#'],
]

The top row of the board is considered row zero and row numbers increase as they go down.
------------------------------------------------------------------------------------------------ */

const battleship = (board, row, col) => {
  //  Solution code here...
  if(board[row][col] === '#'){
    return 'hit';
  } else {
    return 'miss'
  }
};

/* ------------------------------------------------------------------------------------------------
CHALLENGE 5

Write a function named calculateProduct that takes in a two-dimensional array of numbers, multiplies all of the numbers in each array, and returns the final product. This function should work for any number of inner arrays.

For example, the following input returns a product of 720: [[1,2], [3,4], [5,6]]
------------------------------------------------------------------------------------------------ */

const calculateProduct = (numbers) => {
  // Solution code here...
  let product = 1;
  numbers.forEach(arr => arr.forEach(number => product *= number));
  return product;
};

/* ------------------------------------------------------------------------------------------------
CHALLENGE 6

Write a function named averageDailyTemperature that accepts a two-dimensional array representing average daily temperatures grouped week-by-week.

Calculate the average daily temperature during that entire period. Your output should be a single number. Write your function so it could accept an array with any number of weeks given to it.
------------------------------------------------------------------------------------------------ */

// Real daily average temperatures for Seattle, October 1-28 2017
const weeklyTemperatures = [
  [66, 64, 58, 65, 71, 57, 60],
  [57, 65, 65, 70, 72, 65, 51],
  [55, 54, 60, 53, 59, 57, 61],
  [65, 56, 55, 52, 55, 62, 57],
];

const averageDailyTemperature = (weather) => {
  // Solution code here...
  let sum = 0;
  let num = 0;
  for(let week = 0; week < weather.length; week++){
    for(let day = 0; day < weather[week].length; day ++){
      sum += weather[week][day];
      num++
    }
  }
  return sum/num;
};

/* ------------------------------------------------------------------------------------------------
CHALLENGE 7

Write a function named lowestWeeklyAverage that accepts a two-dimensional array of daily temperatures grouped week-by-week.

Calculate the average temperature for each week and return the value of the lowest weekly average temperature.

For example, in the data set below, the lowest weekly average is 46, which is the average of the temperatures in week 2. All other weeks have average temperatures that are greater than 46.
------------------------------------------------------------------------------------------------ */

let lowestWeeklyTemperatureData = [
  [33, 64, 58, 65, 71, 57, 60],
  [40, 45, 33, 53, 44, 59, 48],
  [55, 54, 60, 53, 59, 57, 61],
  [65, 56, 55, 52, 55, 62, 57],
];

const lowestWeeklyAverage = (weather) => {
  // Solution code here...
  let lowest = 100000;
  for(let week = 0; week < weather.length; week++){
    let sum = 0;
    let num = 0;
    for(let day = 0; day < weather[week].length; day ++){
      sum += weather[week][day];
      num++
    }
    let average = sum/num
    if(average < lowest) lowest = average;
  }
  return lowest;
};

/* ------------------------------------------------------------------------------------------------
CHALLENGE 8

Write a function called excel that accepts a string representing rows and columns in a table.

Rows are seperated by newline "\n" characters. Columns are seperated by commas. For example, '1,1,1\n4,4,4\n9,9,9' represents a 3x3 table.

The function should parse the string as rows and columns and compute the sum of the values for each row. Return an array with the sum of the values in each row.

For example, excel('1,1,1\n4,4,4\n9,9,9') returns [3, 12, 27].
------------------------------------------------------------------------------------------------ */

const excel = (str) => {
  // Solution code here...
  let blah = (str.split('\n'));
  let arr = [];
  for(let i = 0; i < blah.length; i++){
    arr.push(blah[i].split(','))
  }
  console.log('arr is',arr)
  let avgs = [];
  for(let x = 0; x < arr.length; x++){
    let sum = 0;
    for(let y = 0; y < arr[x].length; y++){
      sum += Number(arr[x][y]);
      console.log('value is',arr[x][y],'sum is',sum);
    }
    avgs.push(sum);
  }
  return avgs;
};

/* ------------------------------------------------------------------------------------------------
TESTS

All the code below will verify that your functions are working to solve the challenges.

DO NOT CHANGE any of the below code.

Run your tests from the console: jest challenge-12.test.js

------------------------------------------------------------------------------------------------ */


describe('Testing challenge 1', () => {
  test('It should add the hourly totals array', () => {
    expect(grandTotal(cookieStores)).toStrictEqual([88, 153, 252, 286, 139, 161, 145, 232, 276, 207, 161, 169]);
  });
});

describe('Testing challenge 2', () => {
  test('It should create an object of data for each store', () => {
    expect(salesData(hoursOpen, grandTotal(cookieStores))).toStrictEqual([
      { sales: '88 cookies', time: '9 a.m.' },
      { sales: '153 cookies', time: '10 a.m.' },
      { sales: '252 cookies', time: '11 a.m.' },
      { sales: '286 cookies', time: '12 p.m.' },
      { sales: '139 cookies', time: '1 p.m.' },
      { sales: '161 cookies', time: '2 p.m.' },
      { sales: '145 cookies', time: '3 p.m.' },
      { sales: '232 cookies', time: '4 p.m.' },
      { sales: '276 cookies', time: '5 p.m.' },
      { sales: '207 cookies', time: '6 p.m.' },
      { sales: '161 cookies', time: '7 p.m.' },
      { sales: '169 cookies', time: '8 p.m.' }
    ]);

    expect(salesData(hoursOpen, grandTotal(cookieStores)).length).toStrictEqual(hoursOpen.length);
  });
});


describe('Testing challenge 3', () => {
  test('It should return the number 24', () => {
    expect(howManyTreats(errands)).toStrictEqual(24);
  });
});

describe('Testing challenge 4', () => {
  const battleshipData = [
    ['#', ' ', '#', ' '],
    ['#', ' ', '#', ' '],
    ['#', ' ', ' ', ' '],
    [' ', ' ', '#', '#'],
  ];

  test('It should return "hit" when it hits a boat', () => {
    expect(battleship(battleshipData, 0, 0)).toStrictEqual('hit');
    expect(battleship(battleshipData, 1, 0)).toStrictEqual('hit');
  });

  test('It should return "miss" when it doesn\'t hit a boat', () => {
    expect(battleship(battleshipData, 0, 1)).toStrictEqual('miss');
    expect(battleship(battleshipData, 3, 0)).toStrictEqual('miss');
  });
});

describe('Testing challenge 5', () => {
  test('It should multiply all the numbers together', () => {
    expect(calculateProduct([[1,2], [3,4], [5,6]])).toStrictEqual(720);
  });

  test('It should return zero if there are any zeroes in the data', () => {
    expect(calculateProduct([[2, 3, 4, 6, 0], [4, 3, 7], [2, 4, 6]])).toStrictEqual(0);
  });
  test('It should work even if some of the arrays contain no numbers', () => {
    expect(calculateProduct([[1,2], [], [3,4,5]])).toStrictEqual(120);
  });
});

describe('Testing challenge 6', () => {
  test('It should calculate and return the average temperature of the data set', () => {
    expect(averageDailyTemperature(weeklyTemperatures)).toStrictEqual(60.25);
  });
});

describe('Testing challenge 7', () => {
  test('It should return the lowest weekly average temperature within the data set', () => {
    expect(lowestWeeklyAverage(weeklyTemperatures)).toStrictEqual(57);
    expect(lowestWeeklyAverage(lowestWeeklyTemperatureData)).toStrictEqual(46);
  });
});

describe('Testing challenge 8', () => {
  test('It should return the total count for each row', () => {
    let result = excel('1,1,1\n4,4,4\n9,9,9');
    expect(result.length).toStrictEqual(3);
    expect(result[0]).toStrictEqual(3);
    expect(result[1]).toStrictEqual(12);
    expect(result[2]).toStrictEqual(27);
  });
});
