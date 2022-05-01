
# Appcent - Java Software Engineer Assessment




#### Getting Started

- JDK 1.8 or later
- Maven 3.0 or later

#### Clone

```bash
git clone https://github.com/sametcanal53/Appcent-JSEA.git
cd Appcent-JSEA
```
    
#### Deployment


```bash
  src -> Run As -> Java Application -> http://localhost:8080/swagger-ui.html
```


# API
## Task
#### Get Item

```
  GET /api/tasks/getAll
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `_` | `List<Task>` | Get all tasks |

```
  GET /api/tasks/getByTaskName
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `taskName` | `string` | Get task |

```
  GET /api/tasks/getByTaskNameContains
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `taskName` | `string` | Get Task Name Contains |



```
  GET /api/tasks/getByUser
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `integer` | Get User |


#### Post Item


```
  POST /api/tasks/add
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `Task`      | `Task` | Add task |



```
  POST /api/tasks/update
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `Task`      | `Task` | Update task |


```
  POST /api/tasks/delete
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `integer` | Delete task |


## User

#### Get Item

```
  GET /api/users/getAll
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `_` | `List<User>` | Get all users |

#### Post Item


```
  POST /api/users/add
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `User`      | `User` | Add user |



```
  POST /api/users/update
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `User`      | `User` | Update user |


```
  POST /api/users/delete
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `id`      | `integer` | Delete user |
